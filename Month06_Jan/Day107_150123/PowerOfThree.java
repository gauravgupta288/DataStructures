package Month06_Jan.Day107_150123;

public class PowerOfThree {
    public static void main(String[] args) {

    }

    static boolean powerOfThree(int n){
        if(n==1)return true;
        if(n%3!=0) return false;
        while(n>3){
            n =n/3;
            if(n%3!=0)return false;
            if(n==3 && n%3==0){
                return true;
            }
        }

        return n==3?true:false;
    }
}
