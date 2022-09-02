package gg.Month00_July.Archived;

import java.util.HashMap;

public class FindIndex {
    public static void main(String s[]){
        System.out.println(findIndex(28));
    }
    static String findIndex(int index){
       String str = "";

       while(index >0){
            int m = --index%26;

            char c =  (char)('A'+m);
           str = c+str;
            index /=26;
       }
       return str;
    }
}
