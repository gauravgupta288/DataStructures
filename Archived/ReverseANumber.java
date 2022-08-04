package gg.Archived;


public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = -1234567899;
		int sign = +1;
		
		reverseNum_sol2(num);
		System.out.println(String.format("Reverse of Number {%s} is {%s} " ,num, (sign)*reverseNumber_sol1(num)));
		System.out.println(reverseNum_sol3(num));
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
		int n = String.valueOf(x).length();
		int arr[] = new int[n];
		int i = 0;
		char sign = '+';
		if(x == 0) {
			System.out.print(0);
		}else if(x<0) {
			x = -x;
			sign='-';
		}
		while(x>0) {
			arr[i++] = x%10;
			x = x/10;
		}
		
		if(sign=='-') {
			System.out.print(sign);
		}
		
		for(int j=0;j<i;j++) {
			System.out.print(arr[j]);
		}
	}
		
		static int reverseNum_sol3(int x) {
			int rev = 0;
	        
	        while(x!=0){
	            int n = x%10;
	            x=x/10;
	            
	           if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && n>7)) {
	            	return 0;
	            }else if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && n>8)) {
	            	return 0;
	            }
	            rev = rev*10+n;
	        }
	        return rev;
		}
	}
