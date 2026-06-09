class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            maxHeap.offer(nums[i]);
        }

        int count = 1;
        while(count!=k){
            maxHeap.poll();
            count++;
        }
        return maxHeap.peek();
    }
}
