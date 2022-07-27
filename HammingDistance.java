package gg;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }
    static int hammingDistance(int x, int y){
        int xArr[] = changeToBinary(x);
        int yArr[] = changeToBinary(y);

        int changeCount = 0;

        for(int i = xArr.length-1;i>=0;i--){
            if(xArr[i] != yArr[i]){
                changeCount++;
            }
        }
        return changeCount;
    }

    static int[] changeToBinary(int n){
        int arr[] = new int[32];
        int len = 31;
        while(n!=0){
            arr[len--] = n%2;
            n/=2;
        }
        return arr;
    }
}
