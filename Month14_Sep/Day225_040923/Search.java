package Month14_Sep.Day225_040923;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);row1.add(2);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(3);row2.add(3);
//        ArrayList<Integer> row3 = new ArrayList<>();
//        row3.add(7);row3.add(8);row3.add(9);

        list.add(row1);list.add(row2);
        System.out.println(solve(list, 3 ));
    }

    public static int solve(ArrayList<ArrayList<Integer>> arr, int element){
        int row = arr.size();
        int col = arr.get(0).size();
        int ans = Integer.MAX_VALUE;

        int i = 0;
        int j = col - 1;

        while(i < row && j >=0 ){
            int temp = arr.get(i).get(j);

            if(temp == element){
                ans = Math.min(ans, (i + 1) * 1009 + j + 1);
                j--;

            }else if(temp > element){
                j--;
            }else{
                i++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
