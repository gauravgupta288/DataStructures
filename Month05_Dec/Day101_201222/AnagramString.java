package Month05_Dec.Day101_201222;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(anagram("aab", "bab"));
    }

    static int anagram(String s, String t) {
        int[] arr = new int[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
                arr[t.charAt(i) - 'a']--;
        }

        for (int i : arr) {
            if(i > 0){
                count += i;
            }
        }

        return count;
    }
}
