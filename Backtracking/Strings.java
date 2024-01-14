package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    public static void main(String[] args) {

        String s = "isawsquirrelnearmysquirrelhouseohmy";
        String a = "my";
        String b = "squirrel";

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

            if(ind != 0 || count > 0){
                ind = ind  + b.length();
            }
            ind = s.indexOf(b, ind );

            if(ind != -1){
                l1.add(ind);
            }

            if(ind == 0 && count >= 1){
                break;
            }
            count++;
        }

        List<Integer> ans = new ArrayList<>();

        boolean l1greater;
        int min;
        int max;

        if(l.size() >= l1.size()){
            max = l.size();
            min = l1.size();
            l1greater = true;
        }else{
            max = l1.size();
            min = l.size();
            l1greater = false;
        }

        for(int i : l){
            for(int j : l1){
                if(Math.abs(i - j) <= k){
                    ans.add(i);

                    break;
                }
            }
        }

        System.out.println(ans);
    }


}
