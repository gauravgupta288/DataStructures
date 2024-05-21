package JavaConcepets;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(solve("title", "paper"));
    }

    public static boolean solve(String s, String t){

        int a = 1000;

        Integer x = a;
        Integer y = a;

        System.out.println(x == y);
        int arr[] = new int[512];

        for(int i =0; i< s.length(); i++){
            if(arr[s.charAt(i)] != arr[t.charAt(i)]) return  false;

            arr[s.charAt(i)] = arr[t.charAt(i) + 256] = i + 1;
        }

        return  true;
    }
}
