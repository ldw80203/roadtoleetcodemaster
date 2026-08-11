/*
題目 5：Add One To Linked List

難度：中等偏簡單

給你一條 singly linked list，每個節點是一位數。
數字是「反向儲存」。
請把這個數字加 1，並回傳結果 linked list。

範例 1：
head = [2,4,3]
代表 342
加 1 後是 343
return [3,4,3]

範例 2：
head = [9,9,9]
代表 999
加 1 後是 1000
return [0,0,0,1]

範例 3：
head = [0]
代表 0
加 1 後是 1
return [1]

限制：
1. 不要把 linked list 轉成 int。
2. 用 carry 處理進位。
3. 可以直接修改原 list，也可以建立新 list。

練習重點：
- 這題是 Add Two Numbers 的簡化版。
- 只有一條 list。
- carry 一開始可以設成 1。
- 如果最後 carry 還是 1，要多接一個新節點。

問題：
為什麼 carry 一開始可以是 1？
如果目前節點值是 9，sum = 9 + carry 之後，這一位要放多少？carry 變多少？
*/
class AddOneToLinkedList {
    public ListNode addOne(ListNode head) {
        ListNode ori = head;
        ListNode current = head;

        int carry = 1;
        while(current != null){
            int sum = carry;
            sum += current.val;
            current.val = sum % 10;
            carry = sum / 10;
            if(carry == 0){return ori;}
            if(current.next == null && carry == 1){
                current.next = new ListNode(carry);
                return ori;
            }
            current = current.next;
        }
        return ori;
    }
}
