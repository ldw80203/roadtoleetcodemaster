/*
[101] Symmetric Tree                         難度：Easy

題目：
給一棵二元樹的 root，判斷它是否「左右對稱」（沿著中間那條線照鏡子）。

範例：
      1
     / \
    2   2
   / \ / \
  3  4 4  3
[1,2,2,3,4,4,3]  →  true

      1
     / \
    2   2
     \   \
      3   3
[1,2,2,null,3,null,3]  →  false

限制：節點數 1 ~ 1000

提醒：對稱比的不是「同一棵子樹自己」，而是兩棵子樹互相比。

--------------------------------------------------
基準測驗：不看舊 code、不領提示、15 分鐘上限

1. base case：root == null

2. 回傳值代表什麼（意義，不是型別）：是否左右對稱。左左值是否等於右右值 ＆＆ 左右值是否等於右左值
   （這題可能需要兩個函式，各自的意義都要寫）

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合：左右都true

打爆測資（什麼輸入會讓我的寫法錯）：

結果：15 分鐘內自己解出來？  N
卡在哪：想不到怎麼建判斷值得函數
--------------------------------------------------
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

    }
    private boolean isSame(TreeNode root,int left, int right){
      if(root.left == null && root.right ==null){
            return true;
      }

      return isSame(root,root.left.left.val, root.right.right.val) && isSame(root,root.left.right.val, root.right.left.val);

    }
}
