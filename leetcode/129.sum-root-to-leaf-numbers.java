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
    public int sumNumbers(TreeNode root) {
     return sumNumbersHelper(root, 0);
 }
 
 private int sumNumbersHelper(TreeNode node, int currentSum) {
     if (node == null) {
         return 0;
     }
 
     // Calculate the sum of numbers formed by root-to-leaf paths
     int newSum = currentSum * 10 + node.val;
     
     // If it's a leaf node, return the sum
     if (node.left == null && node.right == null) {
         return newSum;
     }
 
     // Recursively traverse left and right subtrees
     return sumNumbersHelper(node.left, newSum) + sumNumbersHelper(node.right, newSum);
 }
 
 }