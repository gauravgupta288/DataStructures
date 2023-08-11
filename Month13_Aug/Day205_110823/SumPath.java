package Month13_Aug.Day205_110823;

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

public class SumPath {
    public int hasPathSum(TreeNode A, int B) {
        return isSame(A, B, 0);
    }

    public int isSame(TreeNode A, int targetSum, int curSum) {
        if (A == null) {
            return 0;
        }

        curSum += A.val;

        if (curSum == targetSum && A.left == null && A.right == null) {
            return 1;
        }

        return isSame(A.left, targetSum, curSum) | isSame(A.right, targetSum, curSum);
    }
}
