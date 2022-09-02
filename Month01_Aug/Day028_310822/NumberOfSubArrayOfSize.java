package gg.Month01_Aug.Day028_310822;

public class NumberOfSubArrayOfSize{
    public static void main(String[] args) {

    }

    static int numberOfArray(int arr[], int k, int threshold){
        int count = 0;
        int sum = 0;
        int i;
        for( i = 0; i<k;i++){
            sum += arr[i];
        }

        if(sum/k >= threshold){
            count++;
        }

        for(;i<arr.length;i++){
            sum -= arr[i-k];
            sum += arr[i];

            if(sum/k >= threshold){
                count++;
            }
        }

        return count;
    }
}
