/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 *
 * ---
 * 回傳中序遍歷（左→根→右）的節點值 list。
 * 例：root=[1,null,2,3] → [1,3,2]
 * 注意：BST 的中序結果是由小到大排序好的。
 */

// @lc code=start
import java.util.*;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        if(root == null){
            return inorder;
        }
        inorder.addAll(inorderTraversal(root.left));
        inorder.add(root.val);
        inorder.addAll(inorderTraversal(root.right));
        return inorder;
        
    }
}
// @lc code=end
