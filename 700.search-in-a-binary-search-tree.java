/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
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

2. 回傳值代表什麼？（意義，不是型別）」
   「以 root 為根的這棵子樹，節點植等於val的subtree」

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
有值就回傳 沒有就回傳null
   ______ */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;    
        }
        if(root.val == val){
            return root;
        }
        if(root.val < val){
            return searchBST(root.right, val);
        }
        else if(root.val > val){
            return searchBST(root.left, val);
        }
        return null;
    }
}
// @lc code=end

