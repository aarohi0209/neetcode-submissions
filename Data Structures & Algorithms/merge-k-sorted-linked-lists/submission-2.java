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
    public void populateMinHeap(PriorityQueue<Integer> minHeap, ListNode current){
        while(current!=null){
            minHeap.offer(current.val);
            current = current.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        ListNode head = null;

        for(int i=0;i<lists.length;i++){
            ListNode current = lists[i];
            populateMinHeap(minHeap, current);
        }

        ListNode result = null;
        if(!minHeap.isEmpty()){
            result = new ListNode(minHeap.poll());
            result.next = null;
        }

        ListNode current = result;
        while(!minHeap.isEmpty()){
            current.next = new ListNode(minHeap.poll());
            current = current.next;
        }
        return result;
    }
}
