/*
[104] Maximum Depth of Binary Tree           難度：Easy

題目：
給一棵二元樹的 root，回傳它的最大深度。
最大深度 = 從 root 往下走到最遠的 leaf，中間經過的「節點數」。

範例：
      3
     / \
    9  20
       / \
      15  7
[3,9,20,null,null,15,7]  →  3

[1,null,2]  →  2
[]          →  0

限制：節點數 0 ~ 10^4

--------------------------------------------------
基準測驗：不看舊 code、不領提示、15 分鐘上限

1. base case：root == null

2. 回傳值代表什麼（意義，不是型別）：root-to-lead's node nubmer

3. 假設左右子樹的答案已經在我手上了，我這一層怎麼組合：bigger + 1;

打爆測資（什麼輸入會讓我的寫法錯）：
（提示方向：跟 111 比一比，為什麼 104 不用擔心單邊子樹，111 要？）

結果：15 分鐘內自己解出來？  Y 
卡在哪：
--------------------------------------------------
*/

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);

    }
}
