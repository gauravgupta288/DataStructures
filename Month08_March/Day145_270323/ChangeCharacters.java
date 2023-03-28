package Month08_March.Day145_270323;

import java.util.Arrays;

public class ChangeCharacters {
    public static void main(String[] args) {
        System.out.println(solve("ircvscxggbwkfnqd", 2));
    }

    static int solve(String A, int B){
        int []arr = new int[26];

        for(int i =0; i < A.length(); i++){
            char ch = A.charAt(i);
            arr[ch - 'a']++;
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){

            if(B >= arr[i] && arr[i] > 0){
                int temp = B - arr[i];
                arr[i] -= temp;
                B = B - temp;
            }
            if(B == 0){
                break;
            }
        }

        int cnt = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                cnt++;
            }
        }

        return cnt;
    }
}
