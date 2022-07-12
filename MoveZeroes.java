package gg;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,0,2,0,0,0,0,1,1,1,};
		
		int arr[] =  new int[5];
		 int n = nums.length-1;
	        for(int i=0;i<n;i++){
	            if(nums[i]==0 && nums[n] != 0){
	                int temp = nums[i];
	                nums[i] = nums[n];
	                nums[n] = temp;
	            }else if(nums[n] == 0){
	                n--;
	            }
	        }
	      for(int i=0;i<nums.length;i++) {
	    	  System.out.print( nums[i]+" ");
	      }
	      
	      for(int i = 0;i<3;i++) {
	    	  arr[i] = i+1;
	      }
	      System.out.println();
	      for(int i=0;i<arr.length;i++) {
	    	  System.out.print( arr[i]+" ");
	      }
	}

}
