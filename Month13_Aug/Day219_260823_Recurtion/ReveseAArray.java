package Month13_Aug.Day219_260823_Recurtion;

public class ReveseAArray {
    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5,8, 7, 7, 6}, 8);
    }

    static void reverse(int []arr, int n){
        if(n == -1){
            return ;
        }
        reverse(arr, n-1);
        System.out.print( arr[n] + " ");

    }
}
