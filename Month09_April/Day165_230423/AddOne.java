package Month09_April.Day165_230423;

public class AddOne {
    public static void main(String[] args) {

    }
    static int[] solve(int A[]){
        int carry = 1;

        for(int i = A.length - 1; i >=0;i--){

            if(A[i] == 9 && carry == 1){
                A[i] = 0;
            }else if(carry == 1){
                A[i] += carry;
                carry = 0;
            }
        }

        if(carry == 1){
            int newAns[] = new int[A.length + 1];
            newAns[0] = 1;
            return newAns;
        }

        int k = 0;
        int zeroCount = 0;
        while(A[k] == 0){
            zeroCount++;
            k++;
        }

        if(zeroCount > 0){
            int newAns[] = new int[A.length - zeroCount];
            for(int i = zeroCount;i<A.length;i++){
                newAns[i - zeroCount] = A[i];
            }

            return newAns;
        }

        return A;
    }
}
