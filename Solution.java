package gg;

import java.util.ArrayList;

public class Solution {
	
	public static void main(String str[]) {
		
		int []a = {642, 642, 642, 642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642};
		System.out.print(print2largest(a, a.length-1));
		
	}
    static int print2largest(int a[], int n) {
        // code here
        quickSort(a, 0, n);
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<a.length;i++) {
			if(!al.contains(a[i])) {
				al.add(a[i]);
			}
			System.out.print(a[i]+" ");
		}
        
        System.out.println(" size for array list "+ al.size());
        System.out.println(al.get(al.size()-2)+"arraylist ");
        return al.indexOf(al.size()-1);
    }
    static void swap(int[] arr, int i, int j){
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	static int part(int arr[], int low, int high){
	    
	    int i=low-1;
	    int pivot = arr[high];
	    for(int j=low; j<high;j++){
	        if(arr[j]<pivot){
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i+1, high);
	    return i+1;
	    
	}
	static void quickSort(int []arr, int low, int high){
	    if(low<high){
	        int p = part(arr, low, high);
	        quickSort(arr, low, p-1);
	        quickSort(arr, p+1, high);
	    }
	}
}
