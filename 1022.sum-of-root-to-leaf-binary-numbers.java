/*
 * @lc app=leetcode id=1022 lang=java
 *
 * [1022] Sum of Root To Leaf Binary Numbers
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 * 
    
}
/*完全寫不出來 */
class Solution{
    public int sumRootToLeaf(TreeNode root){
        return helper(root,0);
    }
    public int helper(TreeNode root,int n){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 2*n + root.val;
        }
        return helper(root.left,n*2+root.val) + helper(root.right,n*2+root.val);
    }
}
// @lc code=end

