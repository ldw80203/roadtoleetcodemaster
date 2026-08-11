/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
   root == null（幾乎都是 root == null）

2. 回傳值代表什麼？（意義，不是型別）
   「以 root 為根的這棵子樹的最短距離到最近的leaf」

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
   比較取小*/
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int r = minDepth(root.right);
        int l = minDepth(root.left);
        if(r != 0 && l != 0){
            return Math.min(r,l) + 1;
        }
        if(r == 0){
            return l + 1;
        }
        else if(l == 0){
            return r + 1;
        }
        return -1;
    }
}
// @lc code=end

