package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    public static void main(String[] args) {

        String a = "my";
        String b = "squirrel";
        String s = "isawsquirrelnearmysquirrelhouseohmy";
        int k = 15;
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        int ind = 0;
        int count = 0;
        while(ind != -1){

            if(ind == 0 && count >= 1){
                break;
            }
            if(ind != 0){
                ind = ind  + a.length();
            }
            ind = s.indexOf(a, ind );

            if(ind != -1){
                l.add(ind);
            }
            count++;
        }

        ind = 0;

        count = 0;
        while(ind != -1){
            if(ind == 0 && count >= 1){
                break;
            }
            if(ind != 0){
                ind = ind  + b.length();
            }
            ind = s.indexOf(b, ind );

            if(ind != -1){
                l1.add(ind);
            }

            count++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<l.size() && i < l1.size(); i++){
            if(Math.abs(l.get(i) - l1.get(i)) <= k){
                ans.add(l.get(i));
            }
        }

        System.out.println(ans);
    }


}
