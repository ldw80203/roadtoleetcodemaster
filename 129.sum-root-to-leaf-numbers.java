/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
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
    public int sumNumbers(TreeNode root) {
        return hand(root,0);
    }
    private int hand(TreeNode root, int n){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.val + n*10;
        }
        return hand(root.left,10*n + root.val) + hand(root.right,10*n + root.val);
    }
}
// @lc code=end

