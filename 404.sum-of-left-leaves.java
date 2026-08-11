/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
2.以root為根這棵樹的所有left leaves的sum 
3.l + r */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int sum = 0;

        if(root.left != null && root.left.left == null && root.left.right ==null ){
            sum += root.left.val;    
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + sum;
    }
}
// @lc code=end

