package gg.Month03_Oct.Day060_291022;

public class SortPeople {
    public static void main(String[] args) {

    }

    public String[] sortPeople(String[] names, int[] heights) {

        for(int i = 0; i < heights.length; i++){
            for(int j = i + 1; j < heights.length; j++){
                if(heights[i] < heights[j]){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String tmp = names[i];
                    names[i] = names[j];
                    names[j] = tmp;
                }
            }
        }
        return names;
    }
}
