package Month04_Nov.Day087_291122;

public class ReversePrefix {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

    static String reversePrefix(String word, char ch){

        char chArr[] = word.toCharArray();
        int index = word.indexOf(ch);

        if(index == -1){
            return word;
        }else{
            int start = 0;
            while (start<index){
                char temp = chArr[start];
                chArr[start] = chArr[index];
                chArr[index] = temp;
                start++;
                index--;
            }
        }

        return String.valueOf(chArr);

    }
}
