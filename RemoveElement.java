package gg;

import java.util.HashMap;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,3,2,5,6,7,2,2,2,2};
		int k=2;
		int i =0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != k) {
				nums[i] = nums[j];
				i++;
			}
		}

	}
}
