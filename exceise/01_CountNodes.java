/*
題目 1：Count Nodes

難度：簡單

給你一條 singly linked list 的 head，請回傳這條 linked list 裡有幾個節點。

範例 1：
head = [1,2,3]
return 3

範例 2：
head = []
return 0

限制：
1. 不要修改 linked list。
2. 只練習走訪節點。

練習重點：
- head 是 linked list 的入口，不是陣列。
- current 是用來往後走的指標。
- current = current.next 代表走到下一個節點。

手算提示：
head -> 1 -> 2 -> 3 -> null

一開始：
current = head
count = 0

問題：
每看到一個不是 null 的節點，count 要怎麼變？
current 要怎麼往下一個節點走？
*/
class CountNodes {
    public int countNodes(ListNode head) {
        int count = 0;
        ListNode current = head;

        while (current != null){
            count += 1;
            current = current.next; 
        }

        return count;

    }
}
