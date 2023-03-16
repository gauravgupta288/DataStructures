package Month08_March.Day134_160323;

public class XOROperationInAnArray {
    public static void main(String[] args) {

    }

    static int xorOperation(int n, int start){
        int res = 0;

        for(int i = 0; i < n; i++){
            res ^= (start + 2 * i) ;
        }

        return res;
    }
}
