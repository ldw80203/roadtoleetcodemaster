/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
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
   「以 root 為根的這棵子樹往下到leaf是否有路徑的sum等於targetsum」

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
   左右子樹的root-to-leaf個別的sum加上root自己是否等於targetsum，換句話說，targetsum - root = root.left sum or root.right sum*/
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.right == null && root.left == null && targetSum - root.val== 0){
            return true;
        }

        return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);
    }
    
}
// @lc code=end

