class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (e1, e2) -> e2.getValue() - e1.getValue());

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            maxHeap.offer(entry);
        }

        int []result = new int[k];
        int i = 0;
        while(k>0){
            result[i] = maxHeap.poll().getKey();
            i++;
            k--;
        }
        return result;
    }
}
