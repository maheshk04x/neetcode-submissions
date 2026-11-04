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
    public void reorderList(ListNode head) {
        int size = 0;
        ListNode s = head;
        while(s!=null){
            size++;
            s = s.next;
        }
        int firstHalf = (size+1)/2;
        ListNode left = head;
        for(int i=1;i<firstHalf;i++){
            left = left.next;
        }
        ListNode right = left.next;
        left.next = null;
        //reverse
        ListNode prev = null;
        ListNode next;
        while(right!=null){
            next = right.next;
            right.next = prev;
            prev = right;
            right = next;
        }
        //merge
        ListNode first = head;
        ListNode second = prev;
        ListNode firstNext, secondNext;
        while(second!=null){
            firstNext = first.next;
            secondNext = second.next;
            first.next = second;
            second.next = firstNext;
            first = firstNext;
            second = secondNext;
        }
    }
}
