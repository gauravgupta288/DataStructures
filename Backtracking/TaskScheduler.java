package Backtracking;

public class TaskScheduler {
    public static void main(String[] args) {

        char ch[] = {'A', 'A', 'A', 'B', 'B', 'C'};
        int arr[] = new int[26];
        int n = 2;
        int maxChar = 0;
        for(char c : ch){
            arr[c - 'A']++;
            maxChar = Math.max(maxChar, arr[c - 'A']);
        }
        int maxC = 0;
        for(int i: arr){
            if(i == maxChar){
                maxC++;
            }
        }
        System.out.println(Math.max(ch.length, (maxChar - 1) * n + 1 + maxC));

    }
}
