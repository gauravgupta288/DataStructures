package Month08_March.Day147_300323;

import java.util.ArrayList;

public class ColourfulNumbers {
    public static void main(String[] args) {
        System.out.println(colourful(3245));
    }

    static int colourful(int A){
        ArrayList<Integer> arr = new ArrayList<>();

        while(A > 0 ){
            arr.add(A % 10);
            A /= 10;

        }
        int a[] = new int[(arr.size() * (arr.size() + 1))/2];

        for(int i = 0; i < arr.size(); i++){
            for(int j = i; j < arr.size(); j++){
                if(i == j){
                    a[i] = arr.get(i);
                }else{
                    a[i + j] = a[i] * a[i - 1];
                }
            }
        }

        return 0;
    }
}
