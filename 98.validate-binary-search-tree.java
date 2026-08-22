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
        if(root == null){
            return true;
        }
        return vaild(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }
    private boolena vlaid(TreeNode root,long min,long max){
        if(root == null){
            return true;
        }
        if(!(root.val > min && root.val < max)){
            return false;
        }
        return valid(root.left,min,node.val) && valid(root.right,root.val,max);
    }
}
// @lc code=end

