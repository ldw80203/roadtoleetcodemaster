/*
題目：https://leetcode.com/problems/merge-two-sorted-lists/description/
語言：Java

我的想法：

手算流程：

最簡單解法：

需要記住的資料：

可能的邊界：

迴圈或遞迴中每個變數的責任：

時間複雜度：

空間複雜度：

希望獲得：提示／除錯／完整解答
*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy =new ListNode(0);
        ListNode current = dummy;

        if (list1 == null){return list2;}
        if(list2 == null){return list1;}

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
            }
            else {
            current.next = list2;
            list2 = list2.next;
            current = current.next;
            }
        }
        if(list1 != null){
            current.next = list1;
            list1 = list1.next;
        }
        if(list2 != null){
            current.next = list2;
        }
        return current;
    }
}
