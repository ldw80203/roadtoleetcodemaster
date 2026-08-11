/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
 *
 * ---
 * 每條根到葉的路徑組成一個十進位數，回傳所有路徑數字的總和。
 * 例：[1,2,3] → 12 + 13 = 25
 */

// @lc code=start
// 三格（不填完不准往下寫）
// 1. null 的時候回傳什麼：
// 2. 這個函式回傳什麼（一句中文，不是公式）：
// 3. 遞迴怎麼組合 / 往下傳什麼：

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
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    private int helper(TreeNode root, int n){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return n*10 + root.val;
        }
        return helper(root.left, n*10 + root.val) + helper(root.right, n*10 + root.val);
    }
}
// @lc code=end
