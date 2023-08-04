package Month13_Aug.Day198_030823;



  class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class DeleteANode {
    public TreeNode deleteNode(TreeNode A, int B) {
        if(A == null){
            return A;
        }

        if(B > A.val){
            A.right = deleteNode(A.right, B);
        }

        else if(B < A.val){
            A.left = deleteNode(A.left, B);
        }
        else{

            if(A.left == null){
                return deleteNode(A.right, B);
            }else if(A.right == null){
                return deleteNode(A.left, B);
            }
            A.val = min(A.right);
            A.right = deleteNode(A.right, A.val);
        }
        return A;
    }

    int min(TreeNode A){
        int minvalue = A.val;

        while(A.left != null){
            minvalue = A.left.val;
            A = A.left;
        }

        return minvalue;
    }
}
