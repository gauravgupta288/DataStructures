package JavaConcepets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> arr;
    ExecutorService executorService;

    MergeSort(List<Integer> arr, ExecutorService executorService){
        this.arr = arr;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Sorted by thread : " + Thread.currentThread().getName());
        if(arr.size() <= 1){
            return arr;
        }

        List<Integer> firstHalf = arr.stream().limit(arr.size()/2).collect(Collectors.toList());
        List<Integer> secondHalf = arr.stream().skip(arr.size()/2).collect(Collectors.toList());

        MergeSort leftMergeSorter = new MergeSort(firstHalf, executorService);
        MergeSort rightMergeSorter = new MergeSort(secondHalf, executorService);

        Future<List<Integer>> firstHalfFtr = executorService.submit(leftMergeSorter);
        Future<List<Integer>> secondHalfFtr = executorService.submit(rightMergeSorter);

        List<Integer> firstSortedHalf = firstHalfFtr.get();
        List<Integer> secondSortedHalf = secondHalfFtr.get();

        List<Integer> finalList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < firstSortedHalf.size() && j < secondSortedHalf.size()){
            if(firstSortedHalf.get(i) < secondSortedHalf.get(j))
            {
                finalList.add(firstSortedHalf.get(i++));
            }else{
                finalList.add(secondSortedHalf.get(j++));
            }
        }
        while(i < firstSortedHalf.size()){
            finalList.add(firstSortedHalf.get(i++));
        }

        while(j < secondSortedHalf.size()){
            finalList.add(secondSortedHalf.get(j++));
        }
        return finalList;
    }
}

class Client{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(5,4,2,3,1,9,6,7,8,0);

        ExecutorService es = Executors.newCachedThreadPool();

        MergeSort ms = new MergeSort(list, es);

        Future<List<Integer>> future = es.submit(ms);

        System.out.println(future.get());

        es.shutdown();


    }
}