/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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
/*1. base case：什麼時候不用再往下？
   ______（幾乎都是 root == null）root == null

2. 回傳值代表什麼？（意義，不是型別）
   「以 root 為根的這棵子樹，是否是一棵有效的BST」

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
   用&&判斷兩邊是否都有效，都有效的話再判斷右節點是否大於root以及左節點小於root*/
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    private  boolean helper(TreeNode root,long  max,long  min){
        if(root == null){
            return true;
        }
        if(root.val < max && root.val > min){
            return helper(root.right, max,root.val)&&helper(root.left,root.val,min);
        }   
        return false;
    }
}
// @lc code=end

