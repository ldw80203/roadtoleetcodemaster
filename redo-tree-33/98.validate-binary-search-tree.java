/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 *
 * ---
 * 判斷是否為合法 BST。
 * 合法定義：每個節點的左子樹「所有」節點都比它小，右子樹「所有」節點都比它大。
 * 例：[5,1,4,null,null,3,6] → false（4 在 5 的右邊，但 3 < 5）
 * 陷阱：只比較父子兩層是不夠的。
 */

// @lc code=start
// 三格（不填完不准往下寫）
// 1. null 的時候回傳什麼：false
// 2. 這個函式回傳什麼（一句中文，不是公式）：以root為根的這棵子樹是否為bst
// 3. 遞迴怎麼組合 / 往下傳什麼：左子樹為bst且右子樹也為bst&& root.val < root.right.val && root.val >root.left.val

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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left == null && root.right != null){
            return isValidBST(root.right)&&helper(root.right);
        }
        if(root.left != null && root.right == null){
            return isValidBST(root.left)&&helper(root.left);
        }
        

        return isValidBST(root.left)&&isValidBST(root.right)&&helper(root);
        
    }
    private boolean helper(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left == null && root.right != null){
            return helper(root.right)&&root.val < root.right.val;
        }
        if(root.left != null && root.right == null){
            return helper(root.left)&&(root.val > root.left.val);
        }    
        return  helper(root.left)&&helper(root.right);
    }
}
// @lc code=end
