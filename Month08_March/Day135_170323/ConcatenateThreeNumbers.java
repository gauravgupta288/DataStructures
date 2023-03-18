package Month08_March.Day135_170323;

public class ConcatenateThreeNumbers {
    public static void main(String[] args) {
        System.out.println(solve(28 , 97 , 32));
    }

    static int solve(int A, int B, int C){
        int res = 0;
        int max = 0;
        int min = 0;
        int mid = 0;

        if(A > B){
            if(A > C){
                max = A;
                if(B > C){
                    mid = B;
                    min = C;
                }else{
                    mid = C;
                    min = B;
                }

            }else{
                max = C;
                mid = A;
                min = B;
            }
        } else{
            if(B > C){
                max = B;
                if(A > C){
                    mid = A;
                    min = C;
                }else{
                    mid = C;
                    min = A;
                }
            }else{
                max = C;
                min = A;
                mid = B;
            }

        }

        System.out.println("min "+ min);
        System.out.println("max "+ max);
        System.out.println("mid "+ mid);

        return 0;
    }
}
