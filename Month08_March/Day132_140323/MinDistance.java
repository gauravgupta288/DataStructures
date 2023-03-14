package Month08_March.Day132_140323;

public class MinDistance {
    public static void main(String[] args) {

    }

    static int minDistance(String A){
        int ans = Integer.MAX_VALUE;
        int xvalue = -1;
        int ovalue = -1;


        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
            if(ch == 'x'){
                xvalue = i + 1;
                if(ovalue != -1){
                    ans = Math.min(ans, Math.abs(xvalue - ovalue));
                }
            }else if(ch == 'o'){
                ovalue = i + 1;
                if(xvalue != -1){
                    ans = Math.min(ans, Math.abs(xvalue - ovalue));
                }
            }
        }

        if(xvalue == -1 || ovalue == -1){
            return -1;
        }
        return ans;
    }
}
