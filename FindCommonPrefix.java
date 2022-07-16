package gg;

public class FindCommonPrefix {
    public static void main(String s[]) {
        String strs[] = {"a","aa","aaba", "aa",""};
        System.out.println(commonPrefixSol3(strs));
    }

    static String commonPrefix(String str[]) {
        String temp = "";

        if (str.length == 1) {
            return str[0];
        }

        for (int i = 1; i < str.length; i++) {
            String common = findCommon(str[i], str[i - 1]);
            if (common.equals("")) {
                return "";
            }
            if (i == 1) {
                temp = common;
                continue;

            } else if (common.equals(temp)) {
                temp = common;
            } else {
                temp = findCommon(temp, common);
            }
        }
        return temp;
    }

    static String findCommon(String str1, String str2) {
        String s = "";
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return s;
            }
            s += str1.charAt(i);
        }
        return s;
    }

    static String commonPrefixSol2(String str[]) {
        if (str.length == 1) return str[0];
        String temp = "";

        for (int i = 1; i < str.length; i++) {
            if (i == 1) {
                temp = findCommon(str[i], str[i - 1]);
            } else {
                temp = findCommon(str[i], temp);
            }
            if (temp == "") {
                return temp;
            }
        }
        return temp;
    }
    static String commonPrefixSol3(String str[]){
        if (str.length == 1) return str[0];
        String temp = "";

        for (int i = 1; i < str.length; i++) {
            if (i == 1) {
                temp = findCommon(str[i], str[i - 1]);
            } else if(!str[i].startsWith(temp)){
                temp = findCommon(str[i], temp);
            }
            if (temp == "") {
                return temp;
            }
        }
        return temp;
    }
    stat
}
