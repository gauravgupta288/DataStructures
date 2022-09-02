package gg.Month00_July.Archived;

public class SortedSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]  = {-25,-3,-3, -1, 0, 11, 13, 24};
		
		int start=0,end=arr.length-1,k=arr.length-1;
		int srarr[] = new int[arr.length]; 
		while(start<=end) {
			int ls = arr[start]*arr[start];
			int rs = arr[end]*arr[end];
			
			if(ls<rs) {
				srarr[k--]=rs;
				end--;
			}else {
				srarr[k--]=ls;
				start++;
			}
		}
		for(int i=0;i<srarr.length;i++) {
			System.out.print(" "+srarr[i]);
		}
	}
}
