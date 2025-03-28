/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode t1 = root;
        TreeNode t2 = null;

        if (root == null)
            return new TreeNode(val);
        while(t1 != null)
        {
            t2 = t1;
            if(val > t1.val)
                t1 = t1.right;
            else
                t1 = t1.left;
        }

        if(val > t2.val)
        {
            t2.right = new TreeNode(val);
        }
        else
        {
            t2.left = new TreeNode(val);
        }
        return root;

    }
}