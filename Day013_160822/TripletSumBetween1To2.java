package gg.Day013_160822;

import java.util.ArrayList;
import java.util.Collections;

public class TripletSumBetween1To2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("1.033277");
        al.add("0.654925");
        al.add("0.272755");
        al.add("0.320328");
        al.add("1.962731");
        al.add("0.095948");
        al.add("1.094519");
        System.out.print(triplet(al));
    }

    static int triplet(ArrayList<String> A) {
        Collections.sort(A);
        float sum = 0;
        int k = 1;
        for (int j = 0; j < A.size(); j++) {
            int i = j;
            while (i < j + 3 && i < A.size()) {
                sum += Float.parseFloat(A.get(i++));
                k++;
            }
            if (k%3==0 &&  sum > 1.0 && sum < 2.0) {
                return 1;
            }
        }
        return 0;
    }
}

