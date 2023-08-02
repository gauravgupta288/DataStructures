package Month13_Aug.Day197_020823;


 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class BST {
    public TreeNode searchBST(TreeNode A, int B) {
        if (A == null) {
            return A;
        }

        if (B > A.val) {
            return searchBST(A.right, B);
        } else if (B < A.val) {
            return searchBST(A.left, B);
        } else {
            return A;
        }
    }
}
