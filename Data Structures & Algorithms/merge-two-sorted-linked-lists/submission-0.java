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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode ls = new ListNode(0);
       ListNode tail = ls;
       ListNode l1 = list1;
       ListNode l2 = list2;
       while(l1!=null && l2!=null){
        if(l1.val<=l2.val){
            tail.next = new ListNode(l1.val);
            tail = tail.next;
            l1 = l1.next;
        }else{
            tail.next = new ListNode(l2.val);
            tail = tail.next;
            l2 = l2.next;
        }
       }
       while(l1!=null){
        tail.next = new ListNode(l1.val);
        l1 = l1.next;
        tail = tail.next;
       }
       while(l2!=null){
        tail.next = new ListNode(l2.val);
        l2 = l2.next;
        tail = tail.next;
       }
        return ls.next;
    }
}