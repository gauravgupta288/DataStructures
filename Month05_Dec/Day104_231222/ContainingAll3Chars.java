package Month05_Dec.Day104_231222;

import Month05_Dec.Day105_241222.Abs;

public class ContainingAll3Chars extends Abs {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("aaacb"));
    }

    static public int numberOfSubstrings(String s) {
        int res = 0;
        int arr[] = {-1, -1, -1};

        for(int i =0 ;i < s.length();i++){
            arr[s.charAt(i) - 'a'] = i;
            res += Math.min(arr[0], Math.min(arr[1], arr[2])) + 1;
        }

        return res;
    }

    @Override
    public void test() {

    }
}
