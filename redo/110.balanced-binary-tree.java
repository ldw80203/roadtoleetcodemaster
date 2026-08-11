/*
[110] Balanced Binary Tree                   難度：Easy

題目：
給一棵二元樹的 root，判斷它是否「高度平衡」。

高度平衡 = 樹裡「每一個」節點的左右子樹高度差都不超過 1。
（不是只看 root，是每個節點都要滿足）

範例：
      3
     / \
    9  20
       / \
      15  7
[3,9,20,null,null,15,7]  →  true

        1
       / \
      2   2
     / \
    3   3
   / \
  4   4
[1,2,2,3,3,null,null,4,4]  →  false

[]  →  true

限制：節點數 0 ~ 5000

--------------------------------------------------
基準測驗：不看舊 code、不領提示、15 分鐘上限

1. base case：root == null


2. 回傳值代表什麼（意義，不是型別）：第一判斷是否平衡 ，第二回傳高度
   （這題你上次就是卡在這裡：回傳高度還是布林？可能需要兩個函式）

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合：相減絕對值<= 1

打爆測資（什麼輸入會讓我的寫法錯）：

結果：15 分鐘內自己解出來？  Y 
卡在哪：
--------------------------------------------------
*/

class Solution {
    public boolean isBalanced(TreeNode root) {
         if(root == null){
            return true;
         }
         int x = Math.abs(height(root.left)-height(root.right));

         return x <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int height(TreeNode root){
      if(root == null){
         return 0;
      }
      return Math.max(height(root.left)+1,height(root.right)+1);
    }
}
