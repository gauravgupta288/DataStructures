package gg;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String num = "";
		 int numDigits = String.valueOf(100).length();
		 System.out.println(" v " +numDigits); 
	        int x = 153423646;
	        if(x<0){
	            num = "-";
	            x=-(x);
	        }
	        
	        while(x>0){
	            num = num + Integer.toString(x%10);
	            x= x/10;
	        }
	        System.out.println(" v " +Integer.parseInt(num));  	

		System.out.println("Sorting started");
		int arr[] = {100,1,32,4,5,3,56,2,53,6};
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
		
		for (int j=low;j<high;j++) {
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
