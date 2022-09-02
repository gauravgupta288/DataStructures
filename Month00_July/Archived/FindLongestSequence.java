package gg.Month00_July.Archived;

import java.util.Arrays;
import java.util.HashSet;

public class FindLongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,2,4,5,4,8,7,6,5,5,10,11,12,14,15,16,17};
		
		Arrays.sort(arr);
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			int start = arr[i];
			while(hs.contains(start)) {
				hs.remove(start);
				start++;
				count++;
				
			}
			System.out.println("Max sequence "+count);
			count=0;
		}
		
		

	}

}
