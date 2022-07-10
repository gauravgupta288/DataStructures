package gg;

class FindSecondLargest {
	
	public static void main(String am[]) {
		int a[] = {100,61 ,61, 61,61, 40, 59,93};
		System.out.println(print2largest(a,a.length));
	}
    static int print2largest(int arr[], int n) {
        // code here
        
    int first, second;
    first = arr[0];
    second = arr[1];
    for(int i=0;i<n;i++) {
    	
    	if(arr[i]>first) {
    		second = first;
    		first = arr[i];
    	}else if(arr[i]>second && arr[i] != first) {
    		second = arr[i];
    	}else if(first == second) {
    		second = arr[i];
    	}
    }
    if (first == second ) {
    	return -1;
    }
    return second;
    }
}