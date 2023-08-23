package Month13_Aug.Day216_230823;

public class KthLargestElement {

    public static void main(String[] args) {
        KthLargestElement k = new KthLargestElement();

        System.out.println(k.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;


        for(int i = n/2 - 1; i >= 0; i--){
            heapify(nums, n, i);
        }

        int i = 0;
        for(; i < k;i++){
            heapify(nums, n, i);
        }

        return nums[i-1];

    }

    public void heapify(int arr[], int n, int i){

        int lar = i;

        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l < n && arr[l] > arr[lar]){
            lar = l;
        }
        if(r < n && arr[r] > arr[lar]){
            lar = r;
        }

        if(i != lar){
            int s = arr[i];
            arr[i] = arr[lar];
            arr[lar] = s;

            heapify(arr, n, lar);
        }
    }
}
