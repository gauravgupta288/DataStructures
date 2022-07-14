package gg;

import java.util.*;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> a = new ArrayList<>();
		
		List<Integer> k = new ArrayList<>();
		
		k.add(1);
		k.add(2);
		a.add(k);
		
		
		
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
					arr1.get(arr.get(j)-1);
//					arr[j] = arr1[i-1][j-1] + arr1[i-1][j];
					//System.out.print(arr[j] + " ");
				}
			}
			arr1.add(arr);
		}
		

		for(List<Integer> a:arr1) {
			for(Integer i:a) {
				System.out.print(i + " ");
			}
		}
	}

}
