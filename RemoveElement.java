package gg;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,3,2,5,6,7,2};
		int k=2;
		
		int start =0,end=arr.length-1;
		
		while(start<=end) {
			if(arr[start]==k && arr[end] != k) {
				arr[start++]=arr[end--];
			}else {
				end--;
				start++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
