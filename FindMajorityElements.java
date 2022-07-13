package gg;

import java.util.HashMap;
import java.util.Set;

public class FindMajorityElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {3,2,3,2,3,4,4,4,4,4,4};

		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else {
			hm.put(arr[i], 1);
			}
			if(hm.get(arr[i])>arr.length/2) {
				System.out.print(arr[i] + " Max ");
				break;
			}
		}
	}

}
