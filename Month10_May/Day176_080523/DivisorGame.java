package Month10_May.Day176_080523;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisorGame {
    public static void main(String[] args) {
        printTillN();
        System.out.println(solve(540691213, 38, 9741));
    }

    static int solve(int A, int B, int C){
        int min = Math.min(B, C);
        int max = Math.max(B, C);
        List<Integer> list = new ArrayList<>();

        int count = 0;

        for(long i = 1; i * max <= A; i++){
            list.add((int)i * max);
        }

        for(int i = 0; i < list.size(); i++){
            int num = list.get(i);
            if(num % max == 0){
                count++;
            }
        }
        return count;
    }

    static void printTillN(){

        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();

            if(s.equals("n") || s.equals("no") || s.equals("No")){
                break;
            }


        }
    }
}
