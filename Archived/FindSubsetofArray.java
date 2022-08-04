package gg.Archived;

public class FindSubsetofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	    public String isSubset( long a1[], long a2[], long n, long m) {
	        
	        for(int i=0;i<m;i++){
	            boolean result = findTheNumber(a1,a2[i],n);
	            if(result ==false){
	                return "No";
	               
	            }
	        }
	        return "Yes";
	        
	    }
	    public boolean findTheNumber(long arr[],long num, long n){
	        for(int i=0;i<n;i++){
	            if(arr[i]==num){
	                return true;
	            }
	        }
	        return false;
	    }
	

}
