/*
[108] Convert Sorted Array to BST            難度：Easy

題目：
給一個「已由小到大排序」的整數陣列 nums，
把它轉成一棵「高度平衡」的二元搜尋樹（BST），回傳 root。

高度平衡 = 每個節點的左右子樹高度差不超過 1。

BST 的性質 = 左子樹全部比自己小，右子樹全部比自己大。

範例：
nums = [-10,-3,0,5,9]
可能的答案：
        0
       / \
     -3   9
     /   /
   -10  5
（答案不只一種，只要是高度平衡的 BST 都算對）

nums = [1,3]  →  [1,3] 或 [3,1] 都可以

限制：nums 長度 1 ~ 10^4，且已排序、無重複

--------------------------------------------------
基準測驗：不看舊 code、不領提示、15 分鐘上限

1. base case：root = null

2. 回傳值代表什麼（意義，不是型別）：已經排序好的高度平衡二元搜尋樹

3. 這題跟前面不一樣 —— 不是「組合子樹的答案」，是「決定誰當 root」。
   要平衡的話，該挑哪個當 root？挑完之後左右各剩什麼？   中間的當root，挑完左邊剩放左子樹的數列，右邊同理

打爆測資（什麼輸入會讓我的寫法錯）：

結果：15 分鐘內自己解出來？  N
卡在哪：想到之前有學到要用binary search分群，但在轉換成樹的遞迴時出現問題
--------------------------------------------------
*/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
    }
    private TreeNode build(int[] nums,int left,int right){
      if(left > right){
         return null;
      }
      int mid = (left + right) / 2;   
      TreeNode root = new TreeNode(mid);
      
   

    }
}
