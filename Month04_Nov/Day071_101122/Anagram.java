package Month04_Nov.Day071_101122;

public class Anagram {
    public static void main(String[] args) {

    }
    static boolean  anagram(String s, String t){
        int arr[] = new int[26];

        if (s.length() != t.length()){
            return false;
        }

        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
