class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int []result = new int[k];
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        Set<Map.Entry<Integer, Integer>> entries = freqMap.entrySet();
        for(Map.Entry<Integer, Integer> entry : entries){
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int count = 0;
        while(!minHeap.isEmpty()){
            result[count] = minHeap.poll()[0];
            count++;
        }
        return result;
    }
}
