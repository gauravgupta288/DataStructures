package gg.Month01_Aug.Day027_300822;

public class ReplaceZeroOne {
    public static void main(String[] args) {
        System.out.println(replaceZeroOne("0110101"));
    }

    static int replaceZeroOne(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (s.indexOf("01") >= 0){
            s =  s.replace("01", "10");
            count++;
        }

        return count;
    }
}
