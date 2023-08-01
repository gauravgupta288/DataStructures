package Month13_Aug.Day196_010823;


import java.util.ArrayList;
import java.util.List;
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
}
public class InorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode A) {
        List ans = new ArrayList<>();

        if(A == null){
            return ans;
        }
        ans = pre(A, ans);

        return ans;
    }

    public List<Integer> pre(TreeNode A, List<Integer> ans){
        if(A == null){
            return null;
        }


        pre(A.left, ans);
        ans.add(A.val);
        pre(A.right, ans);

        return ans;
    }
}
