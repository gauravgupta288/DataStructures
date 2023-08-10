package Month13_Aug.Day203_090823_Tries;

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

public class TriesImplementation {
    public static void main(String[] args) {
        Node node = new Node();
        insert(node, "apple");
        insert(node, "app");
        System.out.println(searchPrefix(node, "aple"));
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

    public static String searchPrefix(Node node, String s) {
        Node temp = node;

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {

            if(temp == null){
                return sb.toString();
            }
            if (temp.fre != 1) {
                sb.append(ch);
            }else {
                return sb.toString();
            }
            temp = temp.child[ch - 'a'];
        }

        return sb.toString();
    }
}
