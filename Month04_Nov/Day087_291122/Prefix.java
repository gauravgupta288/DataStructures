package Month04_Nov.Day087_291122;

public class Prefix {
    public boolean areOccurrencesEqual(String s) {

        int a[] = new int[26];

        for(char ch : s.toCharArray()){
            a[ch - 'a' ]++;
        }

        int fcount = 0;
        boolean gotFirstCount = false;
        for(int i : a){
            if(i > 0){
                if(!gotFirstCount){


                    fcount = i;
                    gotFirstCount = true;
                }
                else if(fcount != i){
                    return false;

                }
            }


        }

        return true;
    }

}
