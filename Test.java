import java.util.ArrayList;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int[] preorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();

        ans = pre(A, ans);

        int[] n = new int[ans.size()];

        int k = 0;
        for(int i : ans){
            n[k++] = i;
        }

        return n;
    }

    public ArrayList<Integer> pre(TreeNode A, ArrayList<Integer> ans){
        if(A == null){
            return null;
        }

        ans.add(A.val);
        pre(A.left, ans);
        pre(A.right, ans);

        return ans;
    }
}
