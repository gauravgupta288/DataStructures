package Month09_April.Day149_020423;

import java.util.ArrayList;

public class ColorfulNumber {
    public static void main(String[] args) {
        System.out.println(solve(3245));
    }

    static int solve(int A){
        ArrayList<Integer> arr = new ArrayList<>();
        while(A > 0){
            arr.add(A % 10);
            A /= 10;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int k = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i; j < arr.size(); j++){
                if(i == j){
                    if(ans.contains(arr.get(i))){
                        return 0;
                    }
                    ans.add(arr.get(i));
                }else{
                    if(ans.contains(arr.get(i) * arr.get(j))){
                        return 0;
                    }
                    ans.add(arr.get(i) * arr.get(j));
                }
            }
        }

        return 1;
    }
}
