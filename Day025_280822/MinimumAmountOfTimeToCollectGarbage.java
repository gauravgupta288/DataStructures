package gg.Day025_280822;

public class MinimumAmountOfTimeToCollectGarbage {
    public static void main(String[] args) {
        System.out.println(minTime(new String[]{"G","P","GP","GG"}, new int[]{2, 4, 3}));
    }

    static int minTime(String[] garbage, int[] travel) {
        int time = garbage[0].length();

        int gStart = 0;
        int pStart = 0;
        int mStart = 0;

        for (int i = 1; i < garbage.length; i++) {
            time += garbage[i].length();
            char ch[] = garbage[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if(ch[j] == 'G'){
                    time += add(gStart, i-1, travel);
                    gStart = i-1;
                }else if(ch[j] == 'P'){
                    time += add(pStart, i-1, travel);
                    pStart = i-1;
                }else{
                    time += add(mStart, i-1, travel);
                    mStart = i-1;
                }
            }
        }
        return time;
    }

    static int add(int start, int end, int arr[]) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[start];
        }
        return sum;
    }
}
