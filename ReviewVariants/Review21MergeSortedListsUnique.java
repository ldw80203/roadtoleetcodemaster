/*
變體題：Merge Two Sorted Lists Unique

你做過原題：21. Merge Two Sorted Lists

題目：
給你兩條已排序的 linked list：list1 和 list2。
請合併成一條新的排序 linked list，但重複數值只保留一次。

範例：
list1 = 1 -> 2 -> 4
list2 = 1 -> 3 -> 4
return 1 -> 2 -> 3 -> 4

規則：
1. 輸入 list 已經由小到大排序。
2. 回傳結果也要由小到大排序。
3. 重複的 val 只保留一個。

練習重點：
- dummy node
- current 指標
- list1/list2 指標移動
- 接節點前先判斷是否重複
*/
class Review21MergeSortedListsUnique {
    public ListNode mergeTwoListsUnique(ListNode list1, ListNode list2) {
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
