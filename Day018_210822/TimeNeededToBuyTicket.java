package gg.Day018_210822;

import java.util.Arrays;

public class TimeNeededToBuyTicket {
    public static void main(String[] args) {
        System.out.println(timeNeededToBuyTicket(new int[]{2, 3, 2}, 2));
    }

    //TODO - Half completed
    static int timeNeededToBuyTicket(int tickets[], int k) {
        int total = 0;
        int num = tickets[k];
        Arrays.sort(tickets);
        int n = tickets.length;
        int diff = tickets[0];

        for (int i = 0; i < n; i++) {
            total += n * tickets[i];
            if(num-tickets[i]==0){
                return total;
            }
        }
        return total;
    }
}
