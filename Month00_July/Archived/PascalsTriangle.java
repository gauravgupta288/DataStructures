package gg.Month00_July.Archived;

import java.util.*;

public class PascalsTriangle {

	public static void main(String[] args) {
		int noOfCol = 6;
		pasTri(noOfCol);
	}
	static void pasTri(int noOfCol) {
		
		List<List<Integer>> arr1 = new ArrayList<>();
		for(int i=0;i<noOfCol;i++) {
			List<Integer> arr = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(i==j||j==0) {
					arr.add(1);
				}else {
					arr.add(arr1.get(i-1).get(j-1) + arr1.get(i-1).get(j));
				}
			}
			arr1.add(arr);
		}
		for(List<Integer> a:arr1) {
			for(Integer i:a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
