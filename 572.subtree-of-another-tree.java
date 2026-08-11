/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
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
   ______（幾乎都是 root == null） root== null

2. 回傳值代表什麼？（意義，不是型別）
   「以 root 為根的這棵子樹是否存在與subroot相同的樹

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？用||回傳
   ______ */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null){
            return false;
        }
        
      
        return isSubtree(root.left, subRoot)||isSubtree(root.right,subRoot) || isSameTree(root, subRoot);
    }
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        else if(p.val != q.val){
            return false;
        }
        return (isSameTree(p.left, q.left)&&isSameTree(p.right, q.right));
    }
}
// @lc code=end

