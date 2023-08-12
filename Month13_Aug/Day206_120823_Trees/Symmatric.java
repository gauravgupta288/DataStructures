package Month13_Aug.Day206_120823_Trees;

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

class Solution {
    public boolean isSymmetric(TreeNode A) {
        return symHelper(A, A);
    }

    public boolean symHelper(TreeNode A, TreeNode B){
        if(A == null && B == null){
            return true;
        }

        if(A == null || B == null){
            return false;
        }

        return A.val == B.val & symHelper(A.left, B.right) & symHelper(B.left, A.right);
    }
}
