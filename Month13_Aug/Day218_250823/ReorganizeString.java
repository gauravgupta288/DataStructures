package Month13_Aug.Day218_250823;

import java.util.PriorityQueue;

class Pair {
    int f;
    char ch;

    Pair(int f, char ch) {
        this.ch = ch;
        this.f = f;
    }
}

public class ReorganizeString {
    public static void main(String[] args) {
        System.out.println(reorganizeString("aab"));
    }

    public static String reorganizeString(String s) {

        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> b.f - a.f);

        StringBuilder sb = new StringBuilder();
        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;

            if (arr[s.charAt(i) - 'a'] > (s.length() + 1) / 2) {
                return "";
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                heap.add(new Pair(arr[i], (char) (i + 'a')));
            }
        }

        Pair block = heap.poll();
        sb.append(block.ch);
        block.f--;
        while (!heap.isEmpty()) {

            Pair temp = heap.poll();

            sb.append(temp.ch);

            temp.f--;
            if (block.f > 0) {
                heap.add(block);
            }
            block = temp;
        }

        return sb.toString();
    }
}
