package Month09_April.Day150_030423;

import java.util.HashMap;

public class Alienisctionary {
    public static void main(String[] args) {
        System.out.println(solve(new String[]{"fine", "none", "no"}, "qwertyuiopasdfghjklzxcvbnm"));
    }

    static int solve(String []A, String B){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < B.length(); i++){
            map.put(B.charAt(i), i);
        }
        for(int i = 1; i < A.length; i++){
            String one  = A[i - 1];
            String two = A[i];

            if(one.length() > two.length()){
                return 0;
            }
            int len = Math.min(one.length(), two.length());

            for(int j = 0; j < len; j++){
                if(map.get(one.charAt(j)) > map.get(two.charAt(j))){
                    return 0;
                }else{
                    break;
                }
            }
        }
        return 1;
    }
}
