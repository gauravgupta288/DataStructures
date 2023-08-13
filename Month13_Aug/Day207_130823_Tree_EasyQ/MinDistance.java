package Month13_Aug.Day207_130823_Tree_EasyQ;

import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left=null;
        right=null;
    }
}

public class MinDistance {

    public int solve(TreeNode root){

    ArrayList<Integer> list = new ArrayList<>();


    inorder(root, list);
    int min = Integer.MAX_VALUE;

        for(int i = 0; i < list.size(); i++){
        min = Math.min(min, list.get(i));
    }

 Collections.sort(list);

    int mind = Integer.MAX_VALUE;

        for(int i = 1; i < list.size(); i++){

        if(min != list.get(i)){
            mind = Math.min(mind, Math.abs(list.get(i) - list.get(i-1)));
        }
    }

        return mind;


}
    public static void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
