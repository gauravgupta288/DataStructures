import java.util.ArrayList;

public class MostCommonWord {
    public static void main(String[] args) {

    }
    static void mostCommon(String str, String[] banned){
        String []strList = str.split(" ");

        ArrayList<String> bannedList = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        int maxcount = 0;

        for(String bn:banned){
            bannedList.add(bn);
        }

        for( String word:strList){

            if(!bannedList.contains(word) && words.contains(word)){
                maxcount++;
            }else {
                words.add(word);
            }

        }
    }
}
