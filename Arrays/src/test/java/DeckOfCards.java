import java.util.HashMap;

public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println(deckOfCards(new int[]{1,1,1,2,2,2,3,3}));
    }

    static boolean deckOfCards(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int temp = map.get(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (temp != map.get(arr[i])) {
                return false;
            }
        }
        return true;
    }
}
