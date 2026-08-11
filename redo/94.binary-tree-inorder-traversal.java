/*
[94] Binary Tree Inorder Traversal          難度：Easy

題目：
給一棵二元樹的 root，回傳它的「中序遍歷」結果（List<Integer>）。
中序 = 先走左子樹 → 再處理自己 → 再走右子樹。

範例：
    1
     \
      2
     /
    3
輸入 root = [1,null,2,3]  →  輸出 [1,3,2]

輸入 root = []      →  輸出 []
輸入 root = [1]     →  輸出 [1]

限制：節點數 0 ~ 100

--------------------------------------------------
基準測驗：不看舊 code、不領提示、15 分鐘上限

1. base case：root == null

2. 回傳值代表什麼（意義，不是型別）：已經inorder的列表

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合：先放左，再來放自己，在放右

打爆測資（什麼輸入會讓我的寫法錯）：

結果：15 分鐘內自己解出來？  Y 但沒跑測資不知道對不對

卡在哪：
--------------------------------------------------
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> x = new ArrayList<>();
            if(root == null){
                return x;
            }
            
            x.addAll(inorderTraversal(root.left));
            x.add(root.val);
            x.addAll(inorderTraversal(root.right));
            return x;
        } 
}
    
