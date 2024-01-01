package Month15_Oct.Day05Oct;

public class LongestSubsString {
    public static void main(String[] args) {
        System.out.println(maximumLength("aaa"));
    }

    public static int maximumLength(String s) {

        int maxCount = Integer.MIN_VALUE;
        int ans=1;
        int max = s.length() - 2 ;
        for(int i = 0; i < s.length(); i++){

            int count = 1;

            char ch = s.charAt(i);
            int nextIndex = i + 1;

            while(max > 0 && nextIndex < s.length() && ch == s.charAt(nextIndex)){
                nextIndex++;
                count++;
                maxCount = Math.max(maxCount, count);
                if(max<= maxCount){
                    ans++;
                    break;
                }

            }

            if(max > maxCount){
                max--;
            }

        }

        return ans == 3 ? maxCount : -1;
    }
}
