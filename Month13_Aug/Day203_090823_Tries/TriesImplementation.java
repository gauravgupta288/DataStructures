package Month13_Aug.Day203_090823_Tries;

class Node{
    Node child[];
    boolean isWordEnd;

    Node(){
        child = new Node[26];
        isWordEnd = false;
    }
}

public class TriesImplementation {
    public static void main(String[] args) {
        Node node = new Node();
        insert(node, "apple");
        insert(node, "app");
        System.out.println(search(node, "applee"));
    }
    public static void insert(Node node, String str){
        Node temp = node;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(temp.child[ch - 'a'] == null){
                temp.child[ch - 'a'] = new Node();
            }

            temp = temp.child[ch - 'a'];
        }

        temp.isWordEnd = true;
    }

    public static boolean search(Node node, String str){
        Node temp = node;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(temp.child[ch - 'a'] == null){
                return false;
            }else{
                temp = temp.child[ch - 'a'];
            }
        }

        return temp.isWordEnd;
    }
}
