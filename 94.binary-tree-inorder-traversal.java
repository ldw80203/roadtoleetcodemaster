/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
/*題目翻譯:
給二元數的根，回傳中序遍歷（Inorder Traversal）的結果。Inorder Traversal(中序遍歷)：由左子節點、根節點、右子節點，根排在中間的排序方式。
陣列規則：假設某個節點在陣列中的索引（Index）為 \(i\)：它的左子節點一定在 \(2i + 1\) 的位置。它的右子節點一定在 \(2i + 2\) 的位置。
手算範例:
Input: root = [1,null,2,3]


 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;

    }
    private void helper(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }
}
// @lc code=end

