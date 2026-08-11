/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        if(root.left.val > root.val){
            return root.left.val;
        }
        if(root.right.val > root.val){
            return root.right.val;
        }
        if(findSecondeMinmumValue(root.left) == -1){
            return  findSecondeMinmumValue(root.right);
        }
        if(findSecondeMinmumValue(root.right) == -1){
            return  findSecondeMinmumValue(root.left);
        }
        
    }
}
// @lc code=end

