package gg.Day012_150822;

import java.util.Arrays;

public class MaximizeToys {
    public static void main(String[] args) {

    }
    static int maximizeToys(int N, int K, int arr[]){
        Arrays.sort(arr);
        long sum = 0;
        int i = 0;
        while(i<N){
            sum += arr[i];
            if(sum==K)return i+1;
            else if(sum>K){
                return i;
            }i++;
        }
        if(i==N)return i;
        return -1;
    }
}
