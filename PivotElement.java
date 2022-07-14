package gg;

public class PivotElement {
		
	public static void main(String str[]) {
		
		int arr[] = {1,3,7,6,5,6};
		int n = arr.length;
		System.out.print(findPivot(arr, n));
	}
	static int findPivot(int arr[], int n) {
		 int sum=0;
	        for(int i:arr){
	            sum+=i;
	        }
	        int ls=0;
	        for(int i=0;i<n;i++){
	            if(ls==sum-ls-arr[i]) return i;
	            ls+=arr[i];
	        }
	        return -1;
	}
}
