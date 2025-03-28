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
    public static List<Integer> rightSideView(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         if (root == null)
             return list;
         
         trav(root, list, 0);
         return list;
     }
     public static void trav(TreeNode n, List<Integer> answer, int lvl)
     {
         if (n == null)
             return;
         if(lvl == answer.size())
             answer.add(n.val);
         trav(n.right, answer, lvl + 1);
         trav(n.left, answer, lvl + 1);
         
 }}