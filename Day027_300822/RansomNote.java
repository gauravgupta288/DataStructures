package gg.Day027_300822;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(ransomNoteSol2("aa", "ccaabc"));
    }

    static boolean ransomNote(String ransomNote, String magazine) {
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);
        }


        for (int i = 0; i < ransomNote.length(); i++) {
            if (map2.containsKey(ransomNote.charAt(i)) && map2.get(ransomNote.charAt(i)) > 0) {
                map2.put(ransomNote.charAt(i), map2.get(ransomNote.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    static boolean ransomNoteSol2(String ransomNote, String magazine) {
        int letters[] = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            letters[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0;  i < magazine.length(); i++) {
            letters[magazine.charAt(i) - 'a']--;
        }
        for(int i:letters){
            if(i > 0){
                return false;
            }
        }
        return true;
    }
}
