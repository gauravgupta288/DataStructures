package gg.Month01_Aug.Day026_290822;

import java.util.*;

public class Team{
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        int k = sc.nextInt();

        int count = 0;

        if(i==1)count++;
        if(j==1)count++;
        if(k==1)count++;

        System.out.println(count);
    }
}