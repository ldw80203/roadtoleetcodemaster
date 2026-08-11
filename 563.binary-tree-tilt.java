/*
 * @lc app=leetcode id=563 lang=java
 *
 * [563] Binary Tree Tilt
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
/*1.root == null
2.*/
class Solution {
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        int tiltsum = 0;
        tiltsum += Math.abs(sum(root.left) - sum(root.right));
        return findTilt(root.left) + findTilt(root.right) + tiltsum;
    }
    private int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        return sum(root.left) + sum(root.right) + root.val;
        
    }
}
// @lc code=end

