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
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        ListNode result = null;
        while(list1!=null){
            minHeap.offer(list1.val);
            list1 = list1.next;
        }

        while(list2!=null){
            minHeap.offer(list2.val);
            list2 = list2.next;
        }

        if(!minHeap.isEmpty()){
            int top = minHeap.poll();
            result = new ListNode(top);
            result.next = null;
        }

        ListNode current = result;
        while(!minHeap.isEmpty()){
            int top = minHeap.poll();
            current.next = new ListNode(top);
            current = current.next;
        }
        return result;
    }
}