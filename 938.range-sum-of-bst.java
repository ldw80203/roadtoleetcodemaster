/*
 * @lc app=leetcode id=938 lang=java
 *
 * [938] Range Sum of BST
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
2.以root為根的這棵樹所有在low and high範圍內的節點的數值總和 
3.左+右+判斷自身是否在範圍內，是就+入root.val並回傳否則不加*/
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        sum = rangeSumBST(root.left, low, high)+rangeSumBST(root.right, low, high);
        if(root.val <= high && root.val >= low){
            return sum += root.val; 
        }
        return sum;
    }
}
// @lc code=end

