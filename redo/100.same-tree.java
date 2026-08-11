/*
[100] Same Tree                              難度：Easy

題目：
給兩棵二元樹的 root：p 和 q。
判斷它們是否「完全相同」—— 結構一樣，且每個對應位置的值也一樣。

範例：
p = [1,2,3]      q = [1,2,3]      →  true
p = [1,2]        q = [1,null,2]   →  false   （結構不同）
p = [1,2,1]      q = [1,1,2]      →  false   （值不同）

限制：節點數 0 ~ 100

--------------------------------------------------
基準測驗：不看舊 code、不領提示、15 分鐘上限

1. base case：（這題會有不只一個）p,q == null 

2. 回傳值代表什麼（意義，不是型別）：兩棵樹是否相同

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合：p.right == q.right && p.left == q.left 

打爆測資（什麼輸入會讓我的寫法錯）：

結果：15 分鐘內自己解出來？ N
卡在哪：
--------------------------------------------------
*/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null){
            return false;
        }
        return isSameTree(p.left, q.left) == isSameTree(p.right, q.right);
    }
    private boolean issame(TreeNode p,TreeNode q){
        if(p == null)
            
    }
}
