/*
題目 3：Keep Only Distinct Values

難度：較難

給你一條已排序的 singly linked list。
如果某個數字重複出現，就把這個數字的所有節點都刪掉。
最後只保留完全沒有重複過的數字。

範例 1：
head = [1,2,3,3,4,4,5]
return [1,2,5]

範例 2：
head = [1,1,1,2,3]
return [2,3]

範例 3：
head = [1,1]
return []

注意：
這題和 LeetCode 83 不一樣。
LeetCode 83 是重複值保留一個。
這題是只要重複過，全部刪掉。

練習重點：
- sorted list 裡，重複值會連在一起。
- dummy 可以處理開頭就要刪掉的情況。
- current 站在安全節點，檢查 current.next。
- 需要用 while 跳過一整段重複值。

手算提示：
dummy -> 1 -> 1 -> 1 -> 2 -> 3 -> null
current = dummy

問題：
當你發現 current.next.val == current.next.next.val 時，
要如何記住重複的值，並一路跳過所有相同節點？
*/
class KeepOnlyDistinctValues {
    public ListNode deleteDuplicatesAll(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null){
            if(current.next != null && current.next.next != null && current.next.val == current.next.next.val){
                int repeat = current.next.val;
                while(current.next != null && current.next.val == repeat){
                    current.next = current.next.next;
                }
            }
            else{
                current = current.next;
            }
        }
        return dummy.next;
        }
        
    }

