package gg.Month01_Aug.Day024_270822;

public class WateringPlants {
    public static void main(String[] args) {
        System.out.println(wateringPlant(new int[]{3,2,4,2,1}, 6));
    }

    static int wateringPlant(int[] plants, int capacity) {
        int count = 0;
        int temp = capacity;


        for (int i = 0; i < plants.length; i++) {

            if (capacity >= plants[i]) {
                capacity -= plants[i];
                count++;
            } else if (capacity < plants[i]) {
                count += i * 2 + 1;
                capacity =  temp;
                capacity -= plants[i];
            }
        }
        return count;
    }
}
