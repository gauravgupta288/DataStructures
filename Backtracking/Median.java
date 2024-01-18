package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Median {
    public static void main(String[] args) {
        MedianFinder m = new MedianFinder();
        m.addNum(1);
        m.addNum(2);
        System.out.println(m.findMedian());

        m.addNum(3);
        System.out.println(m.findMedian());
    }


}

class MedianFinder {
    int len = 0;
    List<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        list.add(num);
        len++;
    }

    public double findMedian() {
        int k;
        int j;

        if((len & 1) == 0){
            k = len /2;
            j = k - 1;


            int m = list.get(k);
            int n = list.get(j);

            return (double)(m + n)/2;
        }else{
            k = len / 2;

            return list.get(k);
        }
    }
}