package Month15_Oct.Day05Oct;

import java.util.*;

public class Compare {
    public static void main(String[] args) {
        int sum = 0;
        int t = 0;

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 7, 6, 2, 8, 4, 4,6,8,2));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(8, 11,7,7, 10, 8, 7, 5,4,9));

        sort(A, B, (a, b) -> a - b);
        sort(A, B, (a, b) -> (a-b));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < A.size(); i++){
            if(t < A.get(i)){
                sum += B.get(i);
                pq.offer(B.get(i));
                t++;
            }else{
                if(pq.peek() < B.get(i)){
                    sum -= pq.peek();
                    pq.remove();
                    sum += B.get(i);
                    pq.offer(B.get(i));
                }
            }
        }

        System.out.println(sum);
    }

    public static void compare(){


    }

    public static  void sort(List<Integer> list1, List<Integer> list2, Comparator<Integer> comparator){

        List<Pair> combined = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            combined.add(new Pair(list1.get(i), list2.get(i)));
        }
        combined.sort((a, b)-> comparator.compare(a.first, b.first));

        int i = 0;

        for(Pair pair : combined){
            list1.set(i, pair.first);
            list2.set(i, pair.second);
            i++;
        }
    }



}

class Pair{
    Integer first;
    Integer second;
    Pair(Integer first, Integer second){
        this.first = first;
        this.second = second;
    }
}

