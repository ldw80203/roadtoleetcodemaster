/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
 *
 * ---
 * 判斷 subRoot 是否為 root 的一棵子樹（含結構與值完全相同，且必須是完整子樹）。
 * 例：root=[3,4,5,1,2], subRoot=[4,1,2] → true
 * 陷阱：比整棵樹是 isSameTree 的事，isSubtree 只負責找起點。
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

    }
}
// @lc code=end
