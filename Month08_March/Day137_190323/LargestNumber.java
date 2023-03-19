package Month08_March.Day137_190323;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 30, 34, 5, 9}));
    }

    static String solve(int[] A){
        StringBuilder sb = new StringBuilder();
        String[] str =  new String[A.length];
        for(int i = 0; i < A.length; i++){
            str[i] = Integer.toString(A[i]);
        }

        String s1 = "123";
        String s2 = "12";

        for(int i = 0; i < A.length; i++){
            for(int j = i+1; j < A.length; j++){
                if(compare(A[i], A[j])){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            sb.append(A[i]);
        }
        return sb.toString();
    }

    static boolean compare(int A, int B){

        String s = Integer.toString(A);
        String t = Integer.toString(B);

        if(s.charAt(0) < t.charAt(0)){
            return true;
        } else if (s.charAt(0) == t.charAt(0)) {
            if(B > A){
                return true;
            }else{
                return false;
            }
        } else{
            return false;
        }
    }
}
