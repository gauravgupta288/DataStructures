package Month04_Nov.Day064_031122;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {

    }

    static char max(String line) {
        int maxCount = -1;
        char ch = '0';
        int arr[] = new int[26];

        for(int i = 0; i < line.length(); i++){
            arr[line.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxCount){
                ch = (char)('a' + i);
                maxCount = arr[i];
            }
        }

        return ch;
    }
}
