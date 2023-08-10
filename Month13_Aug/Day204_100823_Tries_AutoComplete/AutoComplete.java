package Month13_Aug.Day204_100823_Tries_AutoComplete;

import java.util.ArrayList;

class Node {
    Node child[];
    boolean isWordEnd;
    int fre;

    Node() {
        child = new Node[26];
        isWordEnd = false;
        fre = 0;
    }
}

public class AutoComplete {
    public static void main(String[] args) {
        Node node = new Node();
       int []A = new int[]{0,0,1,1};
       String B[] = new String[]{"hack", "hacker", "hac", "hak"};

       ArrayList<Integer> ans = new ArrayList<>();
       for(int i = 0; i < A.length; i++){
           if(A[i] == 0){
               insert(node, B[i]);
           }else{
               ans.add(contactFinder(node, B[i]));
           }
       }
    }

    public static void insert(Node node, String str) {
        Node temp = node;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (temp.child[ch - 'a'] == null) {
                temp.child[ch - 'a'] = new Node();
            }
            temp = temp.child[ch - 'a'];
            temp.fre++;
        }
        temp.isWordEnd = true;
    }

    public static  void autoComplete(Node n, String[] A){
        Node temp = n;

        for(String str : A){
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt((i));

                if(temp.child[ch - 'a'] != null){
                    temp = temp.child[ch - 'a'];
                }else{
                    break;
                }

            }
        }

    }


    public static  int contactFinder(Node n, String str){
        Node temp = n;

            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt((i));

                if(temp.child[ch - 'a'] == null){
                    return 0;
                }
                temp = temp.child[ch - 'a'];
        }
        return temp.fre;
    }
}
