/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){return null;}
        if(l1 == null){return l2;}
        if(l2 == null){return l1;}
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sums = carry;
            if(l1 != null){
                sums += l1.val;
                l1 = l1.next;}
            if(l2 != null){
                sums += l2.val;
                l2 = l2.next;}
            carry = sums / 10;
            current.next = new ListNode(sums % 10);
            current = current.next;

        }
        return dummy.next;   
    }
}
// @lc code=end

