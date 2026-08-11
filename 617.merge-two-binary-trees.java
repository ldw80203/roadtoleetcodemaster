/*
 * @lc app=leetcode id=617 lang=java
 *
 * [617] Merge Two Binary Trees
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
   root1與root2合併後的新樹

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？把左右樹合在一起並相加root
   ______ */    
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {    
        if(root1 == null && root2 == null){
            return null;
        }
        if(root1 == null){
            return root2;
        }
        else if(root2 == null){
            return root1;
        }
        else{
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left,root2.left);
            root1.right = mergeTrees(root1.right,root2.right);
            return root1;
        }
    }
}
// @lc code=end

