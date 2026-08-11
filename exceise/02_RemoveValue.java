/*
題目 2：Remove Value

難度：中等偏簡單

給你一條 singly linked list 的 head，以及一個整數 val。
請刪掉所有節點值等於 val 的節點，並回傳新的 head。

範例 1：
head = [1,2,6,3,6], val = 6
return [1,2,3]

範例 2：
head = [6,6,1], val = 6
return [1]

範例 3：
head = [6,6], val = 6
return []

限制：
1. 需要處理開頭節點也要被刪掉的情況。
2. 不要建立新的 linked list，直接改 next。

練習重點：
- 為什麼刪頭節點時常用 dummy。
- current.next 是「準備被檢查的下一個節點」。
- current.next = current.next.next 代表跳過 current.next。

手算提示：
dummy -> 6 -> 6 -> 1 -> null
current = dummy

問題：
如果 current.next.val == val，current 要不要移動？
如果 current.next.val != val，current 要不要移動？
*/
class RemoveValue {
    public ListNode removeValue(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }
            else{
            current = current.next;
            }

        }
        return dummy.next;
    }
}
