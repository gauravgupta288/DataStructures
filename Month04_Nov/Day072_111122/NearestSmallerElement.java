package Month04_Nov.Day072_111122;

import java.util.ArrayList;

public class NearestSmallerElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);list.add(1);list.add(4);list.add(3);
        System.out.println(nearestSmaller(list, 4));
    }

    static ArrayList<Integer> nearestSmaller(ArrayList<Integer> A, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans[] = new int[n];
        int smaller = A.get(n-1);
        ans[n-1] = -1;

        for(int i = n - 2; i >= 0 ; i--){
            if(A.get(i) < A.get(i+1)){
                smaller = A.get(i);
            }
            if(A.get(i) > smaller){
                ans[i] = smaller;
            }else{
                ans[i] = -1;
            }
        }

        for(int i = 0;i < ans.length;i++){
            list.add(ans[i]);
        }


        return list;
    }
}
