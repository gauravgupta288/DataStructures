package gg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.function.Function;

public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("gg");
		
		int arr[] = {1,3,2,4,5,7,6,2};
		for (int i=0;i<arr.length;i++) {
			for (int j = i+1;j<arr.length;j++) {
				int temp = 0;
				if (arr[i] > arr[j]){
					 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		String str = "geeksforgeeks";
		
		//System.out.print(str);
		String str1 = "";
		for (int i=str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
			str1 = str1 + str.charAt(i-1);
		}
		System.out.println("\n"+str1);
	
	
	
	Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul");  
	  hm.put(104,"Rahfful");
	  
	  
	  for(Entry<Integer, String> m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());
	  }
	  
	  
	  String name = "Gaurav Gupta kkk gU";
	  char[] charstr = name.toCharArray();
	  
	  HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	  for(char ch:charstr) {
		  char c = Character.toLowerCase(ch);
		  System.out.println(c);
		  if (ch == ' ') {
			  //do nothing
		  }
		  else if(hmap.containsKey(c)) {
			  hmap.put(c,hmap.get(c)+1);
		  }else {
			  hmap.put(c,1);
		  }
	  }
	  System.out.println(hmap);
	  InsertionSort t = new InsertionSort();
	  t.countNumberOfWords();
	  t.addSpaces();
}
	/**
	 * 
	 */
	public void countNumberOfWords() {
		String str = "This is test automation university, n";
		
		String[] strArr = str.split(" ");
		int count = 0;
		for (String word: strArr) {
			count += 1;
		}
		String message = String.format("Number of words in given string is %d", count);
		System.out.println(message);
	}
	public void addSpaces() {
		String str = "StringBuilderClassmnB";
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i = 1; i<str.length();i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				sb.append(" ");
			}
			sb.append(str.charAt(i));
		}
		System.out.print(sb);
	}
}
