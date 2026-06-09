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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;

        while(temp!=null){
            temp = temp.next;
            count++;
        }

        if(count == 1){
            return null;
        }

        int index = (count - n) % count;
        
        if(index == 0){
            head = head.next;
            return head;
        }

        temp = head;
        count = 0;

        while(count!=index-1){
            temp = temp.next;
            count++;
        }

        ListNode removedNode = temp.next;
        temp.next = removedNode.next;
        removedNode.next = null;
        return head;
    }
}
