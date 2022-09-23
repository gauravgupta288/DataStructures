package gg.Month02_Sep.Day048_230922;

import java.util.ArrayList;
import java.util.List;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        System.out.println(capitalize("capiTalIze tHe titLe"));
    }

    static String capitalize(String title) {

        String[] list = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            if(s.length()<3){
                sb.append(s.toLowerCase());
            }else{
                sb.append(s.substring(0,1).toUpperCase()).append(s.substring(1).toLowerCase());
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
