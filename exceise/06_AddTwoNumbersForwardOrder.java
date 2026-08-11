/*
題目 6：Add Two Numbers Forward Order

難度：中等偏難

給你兩條 singly linked list，每個節點是一位數。
數字是「正向儲存」。
請回傳兩個數字相加後的 linked list，結果也要正向儲存。

範例 1：
l1 = [7,2,4,3]
代表 7243

l2 = [5,6,4]
代表 564

return [7,8,0,7]
因為 7243 + 564 = 7807

範例 2：
l1 = [9,9]
l2 = [1]
return [1,0,0]

限制：
1. 不要把 linked list 轉成 int。
2. 可以使用 reverse linked list。
3. 最後結果要是正向儲存。

練習重點：
- LeetCode 2 是反向儲存，直接從 head 加。
- 這題是正向儲存，所以可以先 reverse。
- 反轉後就變回 LeetCode 2 的加法模型。
- 加完後還要 reverse 回正向。

手算提示：
原本：
7 -> 2 -> 4 -> 3
5 -> 6 -> 4

反轉後：
3 -> 4 -> 2 -> 7
4 -> 6 -> 5

從反轉後開始加，最後再反轉結果。
*/
class AddTwoNumbersForwardOrder {
    public ListNode addTwoNumbersForward(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return reverse(dummy.next);
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
