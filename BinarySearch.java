package gg;

import java.util.Arrays;

public class BinarySearch {
	static boolean flag = false;
	public static void main(String[] args) {

		int []arr = {3,2,3};
//		printArray(arr);
		Arrays.sort(arr);
		int a = majorityElement(arr);
		
		System.out.println("majority of element in this array is " + a);
//		printArray(arr);
//		boolean res = searchElement(arr, 313 ,0, arr.length-1);
		
//		System.out.print(res);
	}
	static int majorityElement(int nums[]) {
		 Arrays.sort(nums);
	        
	        
	        for(int i=0;i<nums.length;i++){
	            int j=i+1;
	            int count = 1;
	            while(searchElement(nums, nums[i], j, nums.length-1)==1){
	                count++;
	                j++;
	            }
	            if(count>=nums.length/2){
	                return nums[i];
	            }
	            
	        }
	        return 0;
	}
	static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
static int searchElement(int []arr,int k, int start, int end) {
	
	int pivot = (start+end)/2;
	for(int i=start;i<=end;i++) {
		if(arr[pivot] == k) {
			return 1;
		}else if(arr[pivot] > k) {
			return searchElement(arr, k, i, pivot-1);
		}else{
			return searchElement(arr, k, pivot+1, end);
		}
	}
	return -1;
}
}
