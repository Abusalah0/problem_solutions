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

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        leaves(root1, l1);
        leaves(root2, l2);

        if(l1.equals(l2)) {
            return true;
        }

        return false;
    }

    public static void leaves(TreeNode root, List<Integer> arr) {

        if (root == null) {
            return ;
        }

        if (root.left == null && root.right == null) {
            arr.add(root.val);
        }

        leaves(root.left, arr);
       leaves(root.right,arr);


    }
}


