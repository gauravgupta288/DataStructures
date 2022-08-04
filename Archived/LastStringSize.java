package gg.Archived;

import java.math.BigInteger;

public class LastStringSize {
    public static void main(String str[]) {
        System.out.println(findSize("Hello world    "));
    }

    static int findSize(String str) {
        if (str.equals("")) return -1;
        String strList[] = str.split(" ");

        String temp = strList[strList.length - 1];
        return temp.length();
    }
}
