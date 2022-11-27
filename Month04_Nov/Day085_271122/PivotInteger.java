package Month04_Nov.Day085_271122;

public class PivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(15));
    }

    public static int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int i = 1;
        int startSum = i;
        int endSum = n;
        while(i < n){
            if(startSum < endSum){
                startSum += ++i;
            }else if(startSum > endSum){
                endSum += --n;
            }else if(startSum == endSum ){
                if(i+1 == n-1){
                    return i+1;
                }else{
                    startSum += ++i;
                    endSum += --n;
                }
            }
        }
        return -1;
    }
}
