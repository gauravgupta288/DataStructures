package Month13_Aug.Day202_080823;

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

public class TwoTreeAreSame {
    public static void main(String[] args) {

    }

    public int isSameTree(TreeNode A, TreeNode B){

        if(A == null && B == null){
            return 1;
        }

        if(A == null && B != null || A != null && B == null){
            return 0;
        }

        int k = isSameTree(A.left , B.left);

        if(A.val != B.val){
            return 0;
        }

        return k & isSameTree(A.right, B.right);
    }
}
