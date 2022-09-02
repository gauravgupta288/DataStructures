package gg.Month00_July.Archived;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,6,3,4};
		System.out.print(maxProfit(arr));
		

	}
static int maxProfit(int[] arr) {
        
        int n = arr.length;
        int max_diff = 0;
        for(int i=0;i<n;i++){
            
            
            for(int j=i+1;j<n;j++){
                int diff = arr[i] - arr[j];
                
                if(arr[i]>arr[j]){
                    break;
                }else if(max_diff>diff){
                    max_diff = diff;
                }
            }
            
        }
        return (-max_diff);
    }

}
