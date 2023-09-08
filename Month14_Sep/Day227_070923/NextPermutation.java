package Month14_Sep.Day227_070923;

import java.util.ArrayList;

public class NextPermutation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);list.add(2);list.add(1);
        solve(list);
        System.out.println(list);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int ind1 = -1;
        int ind2 = -1;

        for(int i = A.size() - 2; i >= 0; i--){
            if(A.get(i) < A.get(i + 1)){
                ind1 = i;
                break;
            }
        }

        if(ind1 == -1){
            reverse(A, 0);
        }else{
            for(int i = A.size() - 1; i >= 0;i--){
                if(A.get(i) > A.get(ind1)){
                    ind2 = i;
                    break;
                }
            }

            int temp = A.get(ind1);
            A.set(ind1, A.get(ind2));
            A.set(ind2, temp);

            reverse(A, ind1 + 1);
        }

        return A;

    }

    public static void reverse(ArrayList<Integer> A, int start) {

        int end = A.size() - 1;

        while (start < end){
            int temp = A.get(start);
            A.set(start, A.get(end));
            A.set(end, temp);
            start++;
            end--;
        }
    }
}
