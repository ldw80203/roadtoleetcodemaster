/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
 *
 * ---
 * 回傳所有「左葉子」的值總和。左葉子＝它是某個節點的左小孩，而且自己是葉子。
 * 例：[3,9,20,null,null,15,7] → 24（9 和 15）
 * 老 bug：null 檢查放 && 最前面；左右要相加不是二選一。
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
    public int sumOfLeftLeaves(TreeNode root) {

    }
}
// @lc code=end
