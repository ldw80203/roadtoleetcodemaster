/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int x = Math.abs(height(root.left)-height(root.right));

        return (x <= 1 ) && isBalanced(root.left) && isBalanced(root.right);

    }
    private int height(TreeNode tree){
        if(tree == null){
            return 0;
        }
        int l = height(tree.left);
        int r = height(tree.right);

        return Math.max(l,r) + 1;
    }
}
// @lc code=end

