package JavaConcepets;

public class WordPattern1 {
    public static void main(String[] args) {
        System.out.println(compressedString("abcde"));
    }

    public static String compressedString(String word) {

        StringBuilder sb = new StringBuilder();

        int count = 1;
        int max = 9;
        char ch1 = word.charAt(word.length() - 1);

        for(int i = 0; i < word.length(); i++){

            while(i < word.length() - 1 && word.charAt(i) == word.charAt(i+1) && count < max){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(word.charAt(i));
            count = 1;
        }

        return sb.toString();

    }
}
