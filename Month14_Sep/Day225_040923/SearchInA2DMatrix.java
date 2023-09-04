package Month14_Sep.Day225_040923;

public class SearchInA2DMatrix {
    public static void main(String[] args) {
        System.out.println(search(new int[][]{{1,2}, {3,3}}, 3));
    }

    public static int search(int[][] arr, int element){
        int row = arr.length;
        int col = arr[0].length;

        int start = 0;
        int end = row * col - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;
            int midE = arr[mid/col][mid%col];

            if(midE == element){
                return ((mid/col) + 1) * 1009 + (mid%col) + 1;
            }else if(midE > element){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }


        return -1;
    }
}
