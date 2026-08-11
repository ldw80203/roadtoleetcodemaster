/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*1. base case：什麼時候不用再往下？
   ______（幾乎都是 root == null）root == mull

2. 回傳值代表什麼？（意義，不是型別）
   「以 root 為根的這棵子樹，p and q的共同最低祖先」

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
直接回傳   ______ */  
 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q){
            return root;
        }
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if((root.val > p.val && root.val < q.val) || (root.val < p.val && root.val > q.val)){
            return root;
        }
        return root;
    }
}
// @lc code=end

