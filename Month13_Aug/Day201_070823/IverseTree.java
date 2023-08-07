package Month13_Aug.Day201_070823;

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

public class IverseTree {
    public TreeNode invertTree(TreeNode A) {
        if(A == null){
            return null;

        }

        TreeNode temp = A.right;
        A.right = invertTree(A.left);

        A.left = invertTree(temp);

        return A;
    }
}
