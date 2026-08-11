/*
題目 4：Remove Nodes With Greater Value On Right

難度：較難

給你一條 singly linked list。
如果某個節點右邊存在比它更大的值，就刪掉這個節點。
最後回傳剩下的 linked list。

範例 1：
head = [5,2,13,3,8]
return [13,8]

解釋：
5 右邊有 13，比 5 大，所以刪掉 5。
2 右邊有 13，比 2 大，所以刪掉 2。
13 右邊沒有比 13 大的值，保留。
3 右邊有 8，比 3 大，所以刪掉 3。
8 右邊沒有比 8 大的值，保留。

範例 2：
head = [1,1,1,1]
return [1,1,1,1]

範例 3：
head = [10,5,3,2]
return [10,5,3,2]

限制：
1. 不要把 linked list 轉成 array。
2. 可以改變節點的 next。
3. 可以使用 reverse linked list 的想法。

練習重點：
- linked list 原本不能往左走。
- 先 reverse，才能從原本右邊開始處理。
- maxSoFar 記錄目前看過的最大值。
- 小於 maxSoFar 的節點要刪掉。
- 最後要再 reverse 回原本方向。

手算提示：
原本：
5 -> 2 -> 13 -> 3 -> 8

反轉後：
8 -> 3 -> 13 -> 2 -> 5

從左到右掃反轉後的 list：
maxSoFar = 8

看到 3：
3 < 8，所以刪掉 3。

看到 13：
13 >= 8，所以保留 13，並更新 maxSoFar = 13。

問題：
1. reverse linked list 需要哪三個指標？
2. current.next = prev 之前，為什麼要先存 next？
3. 刪節點時，current 要不要移動？
*/
class RemoveNodesWithGreaterValueOnRight {
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        if(head == null){
            return null;
        }
        ListNode current = head;
        int max = current.val;

        while(current.next != null){
            if(max <= current.next.val){
                max = current.next.val;
                current = current.next;
            }
            else{
                current.next = current.next.next;
            }
        }
        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
