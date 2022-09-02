package gg.Month00_July.Archived;
import java.util.ArrayList;

public class SummationOfTwoNumbers {
	public static void main(String str[]) {
		int []arr = {1,2,3,4,8,5,11,13,20, 7, 89,2,3,4,4,2,24,4,5};
		int k = 100;
		System.out.println(sol0(arr, k));
		quickSort(arr, 0, arr.length-1);
		System.out.println(sol1(arr, k, arr.length-1));
		
		System.out.println("#######################");
		printArray(arr);
		
		
	}
	static ArrayList<Integer> sol0(int arr[], int k) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == k) {
					al.add(arr[i]);
					al.add(arr[j]);
					return al;
				}
			}
		}
		return null;
	}
	static ArrayList<Integer> sol1(int []arr, int k, int end) {
		ArrayList<Integer> al = new ArrayList<>();
		
		int i=0;
		while(i<end) {
			if(arr[i]+arr[end]==k) {
				al.add(arr[i]);
				al.add(arr[end]);
				return al;
			}else if(arr[i]+arr[end]>k) {
				end--;
			}else {
				i++;
			}
		}
		
		return null;
	}
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int arr[], int low, int high) {
		int i = low -1;
		int pivot = arr[high];
		
		for (int j=low; j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
	}
	static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}

}
