package gg;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sorting started");
		int arr[] = {1,3,2,4,5,7,6};
		quickSort(arr, 0, arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int i = low-1	;
		
		for (int j=low;j<high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);

		return i+1;
	}
	static void quickSort(int []arr, int low,int high) {
		if(low < high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}

}
