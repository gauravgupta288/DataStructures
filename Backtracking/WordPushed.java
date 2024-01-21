package Backtracking;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class WordPushed {
    public static void main(String[] args) {
        System.out.println(minimumPushes("aabbccddeeffgghhiiiiii"));
    }

    public static int minimumPushes(String word) {
        int arr[] = new int[26];
        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b)->(b.fre- a.fre));

        for(int i = 0; i < word.length(); i++){
            arr[word.charAt(i) - 'a']++;

        }

        for(int i = 0;i < arr.length; i++){
            if(arr[i] != 0){
                heap.add(new Pair(arr[i], (char)(i + 'a')));
            }

        }

        Map<Character, Integer> map = new HashMap<>();

        int count = 1;
        int c = 0;

        while(!heap.isEmpty()){
            Pair value = heap.poll();

            map.put(value.ch, count);
            if(c>=7){
                c= -1;
                count++;
            }
            c++;
        }

        int ans = 0;

        for(char ch : word.toCharArray()){
            ans += map.get(ch);
        }

        return ans;
    }
}


