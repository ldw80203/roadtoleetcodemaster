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
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*1.root == null 2.所有root to leave的值相加 3.(root.val*2^n)* ? + l + r*/
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        if(root == null){
            return 0;
        }
        return hand(root,0);
    }   
    private int hand(TreeNode root,int n){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return  2*n +  root.val;
        }
        return hand(root.left, 2*n + root.val) + hand(root.right, 2*n +root.val);
    }
    
}
/*完全寫不出來 */
// @lc code=end

