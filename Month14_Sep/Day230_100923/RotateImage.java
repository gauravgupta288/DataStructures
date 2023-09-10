package Month14_Sep.Day230_100923;

import java.util.HashMap;
import java.util.Map;

public class RotateImage {
    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3}, {4,5,6},{7,8,9}});
    }

    static void rotate(int[][] matrix){
        int row = matrix.length;;
        int col = matrix[0].length;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);

        Object[] arr = map.keySet().toArray();


        for(int i : map.keySet()){
            map.get(i);
        }
        //transpose
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }

            }
        }

        //swap columns
        for(int i = 0; i < row; i++){
            int s = 0;
            int e = matrix[i].length - 1;

            while(s < e){
                int t = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = t;
                s++;
                e--;
            }
        }
    }
}
