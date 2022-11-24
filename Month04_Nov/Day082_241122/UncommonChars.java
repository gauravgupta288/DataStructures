package Month04_Nov.Day082_241122;

public class UncommonChars {
    public static void main(String[] args) {
        System.out.println(uncommonChars("geeksforgeeks", "geeksquiz"));
    }

    static String uncommonChars(String A, String B){
        StringBuilder str = new StringBuilder();
        int[] arr = new int[26];

        for(char ch: A.toCharArray()){
            if(B.indexOf(ch) == -1){
                arr[ch - 'a']++;
            }
        }

        for(char ch: B.toCharArray()){
            if(A.indexOf(ch) == -1){
                arr[ch - 'a']++;
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > 0 ){
                str.append((char)('a' + i ));
            }
        }
        return str.length() == 0 ? "-1" : str.toString();
    }
}
