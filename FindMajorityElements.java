package gg;

import java.util.Arrays;

public class FindMajorityElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,4,3,2,4,5,3};
		Arrays.sort(arr);
		
		int count = 1;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] == arr[i-1]) {
				count++;
				
			}
		}
		

	}

}
