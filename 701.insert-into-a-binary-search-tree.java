/*
 * @lc app=leetcode id=701 lang=java
 *
 * [701] Insert into a Binary Search Tree
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
   「以 root 為根的這棵子樹，插入新value後的tree」

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
   ______ */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return  new TreeNode(val);
        }
        if(root.val > val){
            root.left = insertIntoBST(root.left, val);
        }
        else if(root.val < val){
            root.right =  insertIntoBST(root.right, val);
        }
        return root;
    }
}
// @lc code=end

