/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 *
 * ---
 * 回傳所有「根到葉」的路徑字串，格式 "1->2->5"。順序不限。
 * 例：[1,2,3,null,5] → ["1->2->5", "1->3"]
 */

// @lc code=start
import java.util.*;

// 三格（不填完不准往下寫）
// 1. null 的時候回傳什麼：空字串
// 2. 這個函式回傳什麼（一句中文，不是公式）：所有root to leave的路徑字串
// 3. 遞迴怎麼組合 / 往下傳什麼：左字串+root + 右字串+root

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        if(root == null){
            return path;
        }
        path.addAll(helper(root));
        path.addAll(helper(root.left));
        path.addAll(helper(root.right));
        return  path;
    }
    private List<String> helper(TreeNode root){
        List<String> path = new ArrayList<>();
        String s = new String();
        if(root == null){
            return path;
        }
        if(root.left == null && root.right == null){
            s += String.valueOf(root.val);
            path.add(s);
        }
        path.addAll(helper(root.left)) ;
        path.addAll(helper(root.right));
        return path;
    }
}
// @lc code=end
