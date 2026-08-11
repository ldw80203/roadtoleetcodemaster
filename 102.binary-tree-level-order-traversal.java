/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
   ______（幾乎都是 root == null）root == null

2. 回傳值代表什麼？（意義，不是型別）
   「以 root 為根的這棵子樹，」

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合？
   ______   */

   
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        queue.add(root);
        while(queue.size() != 0){
            queue.add(root.left);
            queue.add(root.right);
            List<Integer> level = new ArrayList<>();
            level.add(queue.poll().val);
        }
        



        
    }
}
// @lc code=end

