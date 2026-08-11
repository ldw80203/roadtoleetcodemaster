/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 *
 * ---
 * 把整棵樹左右翻轉，回傳 root。
 * 例：[4,2,7,1,3,6,9] → [4,7,2,9,6,3,1]
 */

// @lc code=start
// 三格（不填完不准往下寫）
// 1. null 的時候回傳什麼：null
// 2. 這個函式回傳什麼（一句中文，不是公式）：翻轉後的樹
// 3. 遞迴怎麼組合 / 往下傳什麼：翻轉後的左樹+翻轉後的右樹

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
    public TreeNode invertTree(TreeNode root) {
        TreeNode current = new TreeNode();
        if(root == null){
            return null;
        }
        current = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(current);
        return root;
    }
}
// @lc code=end
