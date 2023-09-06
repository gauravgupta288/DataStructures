package Month14_Sep.Day226_050923;

import java.util.ArrayList;

public class MaxSumOnTwoDArray {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);list.add(2);list.add(3);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(4);list1.add(5);list1.add(6);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(7);list2.add(8);list2.add(9);

        A.add(list);A.add(list1);A.add(list2);
        System.out.println(solve(A, 2));
    }

    public static int solve(ArrayList<ArrayList<Integer>> A, int B){
        int min = Integer.MIN_VALUE;

        for(int i = 0; i < A.size(); i++){
            for(int j = 0; j < A.size(); j++){
                if(i == 0 && j == 0){
                    continue;
                }else if(i == 0 || j == 0){
                    if(i == 0){
                        int temp = A.get(i).get(j - 1) + A.get(i).get(j);
                        A.get(i).set(j,temp);
                    }else if(j == 0){
                        int temp = A.get(i - 1).get(j) + A.get(i).get(j);
                        A.get(i).set(j,temp);
                    }
                }else{
                    int temp = A.get(i).get(j - 1) + A.get(i - 1).get(j) + A.get(i).get(j) - A.get(i-1).get(j-1);
                    A.get(i).set(j,temp);
                }
            }
        }

        for(int i = 0; i < A.size() - B + 1;i++){
            for(int j = 0; j < A.size() - B  + 1; j++){

                if(i == 0 && j ==0){
                    min = Math.max(A.get(i + B - 1).get(j + B - 1), min);
                }else if (i == 0 || j == 0){
                    if(i == 0){
                        min = Math.max(A.get(i + B - 1).get(j + B - 1) - A.get(i + B - 1).get(j - 1  ), min);
                    }else if(j == 0){
                        min = Math.max(A.get(i + B - 1).get(j + B - 1) - A.get(i - 1).get(j + B - 1), min);
                    }
                }else{
                    min = Math.max(A.get(i + B - 1).get(j + B - 1) - A.get(i + B - 1).get(j - 1) - A.get(i - 1).get(j + B - 1) + A.get(i - 1).get(j - 1), min);
                }

            }
        }
        return min;
    }
}
