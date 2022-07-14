package gg;

public class PivotElement {
		
	public static void main(String str[]) {
		
		int arr[] = {-1,-1,-1,-1,0,-1};
		int n = arr.length;
		System.out.print(findPivot(arr, n));
	}
	static int findPivot(int arr[], int n) {
		int s = 0,e=n-1;
		int ls = arr[0],rs=arr[n-1];
		while(s<=e) {
			if(e==0 || s == n-1) {
				return -1;
			}
			if(ls<rs) {
				ls=ls+arr[++s];
			}else if(ls>rs) {
				rs=rs+arr[--e];
			}else if(ls==rs && s+1==e-1) {
				return s+1;
			}else if(ls == rs){
				ls=ls+arr[++s];rs=rs+arr[--e];
			}else {
				s++;e--;
			}
		}
		return -1;
	}
}
