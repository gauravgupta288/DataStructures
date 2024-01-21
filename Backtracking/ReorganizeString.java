package Backtracking;

import java.util.PriorityQueue;

class Pair{
    int fre;
    char ch;
    Pair(int fre, char ch){
        this.fre = fre;
        this.ch = ch;
    }
}
public class ReorganizeString {
    public static void main(String[] args) {
        System.out.println(solve("vvvlo"));
    }

    public static String solve(String str){
        StringBuilder sb= new StringBuilder();
        int arr[] = new int[26];

        PriorityQueue<Pair> heap = new PriorityQueue<>((a,b)->(b.fre - a.fre));

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 'a']++;

            if(arr[str.charAt(i) - 'a'] > (str.length() + 1)/2){
                return "";
            }
        }

        for(int i = 0; i < arr.length; i++){

            if(arr[i] ==0){
                continue;
            }
            heap.offer(new Pair(arr[i], (char) (i + 'a')));
        }

        Pair block = heap.poll();
        sb.append(block.ch);
        block.fre--;

        while (!heap.isEmpty()){

            Pair temp = heap.poll();
            sb.append(temp.ch);
            temp.fre--;

            if(block.fre > 0){
                heap.offer(block);
            }

            block = temp;

        }

        return sb.toString();
    }
}

interface i{
    int x = 0;
    int j = 0;
    void fun();

}

interface j{
    void fun();
}

interface a extends i,j{
    void fun1();
}

class c implements a{

    @Override
    public void fun() {

    }

    @Override
    public void fun1() {

    }

    public void solve(int a){

    }

}
