package Month13_Aug.Day216_230823;

public class HeapSort {

    public static void main(String[] args) {
        HeapSort hs = new HeapSort();

        int arr[] = new int[]{1,5,4,2,3,10,0};

        hs.print(arr);

        System.out.println();
        hs.heapSort(arr);

        hs.print(arr);
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

    public void  heapSort(int arr[]){

        int n = arr.length;

        for(int i = n/2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public void print(int arr[]){

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
