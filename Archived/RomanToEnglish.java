package gg.Archived;

public class RomanToEnglish {
    public static void main(String s[]) {
        System.out.print(romanToInt("MCMXCIV"));
    }

//    static int romanToEnglish(String s) {
//        int value = 0;
//        int len = s.length();
//        int i = 0;
//        while (i < len) {
//            String str = Character.toString(s.charAt(i));
//
//            if (i != len - 1 && (str.equals("I"))){
//                String str1 = Character.toString(s.charAt(i+1));
//                if(str1.equals("V")){
//                    value += 4;
//                    i++;
//                }
//                else if(str1.equals("X")){
//                    value += 9;
//                    i++;
//                }else{
//                    value += getIntValue(str);
//                }
//            } else if (i != len - 1 && (str.equals("X"))) {
//                String str1 = Character.toString(s.charAt(i+1));
//                if(str1.equals("C")){
//                    value += 90;
//                    i++;
//                }else if(str1.equals("L")){
//                    value += 40;
//                    i++;
//                }
//                else{
//                    value += getIntValue(str);
//                }
//            } else if (i != len - 1 && (str.equals("C"))) {
//                String str1 = Character.toString(s.charAt(i+1));
//                if(str1.equals("D")){
//                    value += 400;
//                    i++;
//                }else if(str1.equals("M")){
//                    value += 900;
//                    i++;
//                }else{
//                    value += getIntValue(str);
//                }
//            }
//            else{
//                value += getIntValue(str);
//            }
//           i++;
//        }
//        return value;
//    }

    static int getIntValue(char s) {
        int value;
        switch (s) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
        }
        return value;
    }

    static int romanToInt(String s){

        int sum = 0;

        if(s.indexOf("IV") !=-1)sum-=2;
        if(s.indexOf("IX") !=-1)sum-=2;
        if(s.indexOf("XL") !=-1)sum-=20;
        if(s.indexOf("XC") !=-1)sum-=20;
        if(s.indexOf("CM") !=-1)sum-=200;
        if(s.indexOf("CD") !=-1)sum-=200;

        for(int i=0;i<s.length();i++){
            sum += getIntValue(s.charAt(i));
        }
        return sum;
    }

}
