/*
 * @lc app=leetcode id=701 lang=java
 *
 * [701] Insert into a Binary Search Tree
 *
 * ---
 * 把 val 插入 BST（保證原本不存在），回傳插入後的 root。
 * 例：root=[4,2,7,1,3], val=5 → [4,2,7,1,3,5]
 * 老 bug：遞迴的回傳值要接回 root.left / root.right。
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
    public TreeNode insertIntoBST(TreeNode root, int val) {

    }
}
// @lc code=end
