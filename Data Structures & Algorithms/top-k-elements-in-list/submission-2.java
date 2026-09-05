class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num:nums){
            if(!freqMap.containsKey(num)){
                freqMap.put(num, 1);
            }else{
                int count = freqMap.get(num);
                freqMap.put(num, count+1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (freqMap.get(b) - freqMap.get(a)));

        pq.addAll(freqMap.keySet());
        int []result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll();
            //System.out.print(result[i]+" ");
        }
        return result;
    }
}
