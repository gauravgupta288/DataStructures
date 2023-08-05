package Month13_Aug.Day199_050823;


import java.util.ArrayList;

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

public class KthSmallestInBST {

    public int kthsmallest(TreeNode A, int B) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr = mm(A, arr );

        //System.out.println(arr);

        return arr.get(B - 1);



    }

    ArrayList<Integer> mm(TreeNode A, ArrayList<Integer> arr){
        if(A == null){
            return null;
        }

        mm(A.left, arr);
        arr.add(A.val);
        mm(A.right, arr);

        return arr;
    }
}
