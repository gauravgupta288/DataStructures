package gg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RemoveDegit {
    public static void main(String s[]){
System.out.print(removeDigit("133235", '3'));
    }
    static String removeDigit(String number, char digit){
        List<String> stringList = new ArrayList<>();
        String num = "0";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i) == digit){
                num = number.substring(0,i)+number.substring(i+1);
                stringList.add(num);
            }
        }
        Collections.sort(stringList);
        return stringList.get(stringList.size()-1);
    }
}
