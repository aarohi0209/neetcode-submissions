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
    public ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l1 = head;
        ListNode l2 = reverseList(slow.next);
        slow.next = null;

        ListNode temp = l1;
        l1 = temp.next;
        int count = 1;

        while(l1!=null && l2!=null){
            count++;
            if(count%2==0){
                temp.next = l2;
                temp = l2;
                l2 = temp.next;
            }else{
                temp.next = l1;
                temp = l1;
                l1 = temp.next;
            }
        }

        if (l1 != null) {
            temp.next = l1;
        } else if (l2 != null) {
            temp.next = l2;
        } else {
            temp.next = null;
        }
    }
}
