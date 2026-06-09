class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char task: tasks){
            freqMap.put(task, freqMap.getOrDefault(task, 0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(freqMap.values());

        int interval = 0;
        int cycle = (n+1);

        while(!maxHeap.isEmpty()){
            List<Integer> taskLeft = new ArrayList<>();
            for(int i=0;i<cycle;i++){
                if(!maxHeap.isEmpty()){
                    int count = maxHeap.poll();
                    if(count-1>0){
                        taskLeft.add(count-1);
                    }
                }
                interval++;
                if(maxHeap.isEmpty() && taskLeft.size()==0){
                    break;
                }
            }

            for(int task: taskLeft){
                maxHeap.offer(task);
            }
        }

        return interval;
    }
}
