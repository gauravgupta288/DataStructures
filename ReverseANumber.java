package gg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153423646;
		int sign = +1;
		
		reverseNum_sol2(num);
		//System.out.print(String.format("Reverse of Number {%s} is {%s} " ,num, (sign)*reverseNumber_sol1(num)));
		
	}
	static long reverseNumber_sol1(int num) {

		long rnum = 0;
		int k = 0;
		int sign = +1;
		if(num<0) {
			num = -num;
			sign = -1;
		}
		while(num>0) {
			k = num%10;
			num=num/10;
			rnum += rnumber(k, num);
		}
		if(rnum>=Integer.MAX_VALUE || rnum<=-Integer.MIN_VALUE) {
			return 0;
		}
		return (sign)*rnum;
	}
	static long rnumber(int num, int onum) {
		int n = String.valueOf(onum).length();
		
		if(onum == 0) {
			return num;
		}
		long deno = 1;
		for(int i=0;i<n;i++) {
			deno = deno*10;
		}
		return deno*num;
	}
	static void reverseNum_sol2(int x) {
		Stack<Integer> s = new Stack<>();
		
		while(x>0) {
			s.add(x%10);
			x = x/10;
		}
		
		for(int i=0;i<s.capacity()-1;i++) {
			System.out.println();
		}
	}

}
