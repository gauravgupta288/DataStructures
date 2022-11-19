package Month04_Nov.Day079_191122;

public class ZigzagArray {
    public static void main(String[] args) {
        zigzagArray(new int[]{4, 3, 7, 8, 6, 2, 1}, 7);
    }

    static void zigzagArray(int arr[], int n){
        for(int i = 0; i < n - 1; i++){
            if(i%2 == 0 && arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }else if(i%2 != 0 && arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
