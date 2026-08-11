/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 *
 * ---
 * 是否存在一條「根到葉」的路徑，節點值總和等於 targetSum。回傳 boolean。
 * 例：[5,4,8,11,null,13,4,7,2,...], targetSum=22 → true（5→4→11→2）
 * 注意：一定要走到葉子才算，半路湊到不算。
 */

// @lc code=start
// 三格（不填完不准往下寫）
// 1. null 的時候回傳什麼：false 
// 2. 這個函式回傳什麼（一句中文，不是公式）：is there has a root to leave's node.val sum equal targetsum
// 3. 遞迴怎麼組合 / 往下傳什麼：left || right 

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
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return targetSum - root.val == 0;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
// @lc code=end
