package Month08_March.Day145_270323;

public class ToLower {
    public static void main(String[] args) {
        System.out.println(to_lower(new char[]{'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'}));
    }

    static char[] to_lower(char[] A) {
        for(int i = 0; i < A.length; i++){
            if(Character.isUpperCase(A[i])){
                A[i] = (char)(A[i] + 32);
            }

        }

        return A;
    }
}
