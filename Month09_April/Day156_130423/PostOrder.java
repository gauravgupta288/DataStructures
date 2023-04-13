package Month09_April.Day156_130423;

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class PostOrder {
    public int[] postorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();

        ans = post(A, ans);

        int[] n = new int[ans.size()];

        int k = 0;
        for (int i : ans) {
            n[k++] = i;
        }

        return n;
    }

    public ArrayList<Integer> post(TreeNode A, ArrayList<Integer> ans) {
        if (A == null) {
            return null;
        }


        post(A.left, ans);

        post(A.right, ans);
        ans.add(A.val);

        return ans;
    }
}
