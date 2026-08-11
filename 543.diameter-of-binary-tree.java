
/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
   ______（幾乎都是 root == null）root = null

2. 回傳值代表什麼？（意義，不是型別）
   「以 root 為根的這棵子樹取任意兩個節點只有一條路的最長邊樹

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
   ______ */
class Solution {
   int ans = 0;
   public int diameterOfBinaryTree(TreeNode root) {
      if(root == null){
         return 0;
      }
      height(root);
      return ans;
    }
    private int height(TreeNode root){
      if(root == null){
         return 0;
      }
      int l = height(root.left);
      int r = height(root.right);
      ans = Math.max(ans,l + r);
      return Math.max(l,r) + 1;
    }
}
// @lc code=end

