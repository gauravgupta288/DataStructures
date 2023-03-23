package Month08_March.Day141_230323;

public class LengthofLongestConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(solve("11111"));
    }

    static int solve(String A){
        int len = 0;
        int oneCount = 0;
        int max = 0;
        for(char ch : A.toCharArray()){
            if(ch == '1'){
                oneCount++;
            }
        }
        if(oneCount == A.length()){
            return oneCount;
        }
        
        for(int i = 0; i < A.length(); i++){
            int l = 0;
            int r = 0;

            char ch1 = A.charAt(i);
            if(ch1 == '0'){
                //Run loop to left side to check all one's
                for(int j = i - 1; j >= 0; j--){
                    char ch = A.charAt(j);
                    if(ch == '1'){
                        l++;
                    }else{
                        break;
                    }
                }

                //Run loop to right side to check all one's
                for(int j = i + 1; j < A.length(); j++){
                    char ch = A.charAt(j);
                    if(ch == '1'){
                        r++;
                    }else{
                        break;
                    }
                }

                if(l + r == oneCount){
                    return l + r;
                } else  {
                    max = Math.max(max, l + r + 1);
                }
            }
        }
        
        return max;

    }
}
