class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int []result = new int[2];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(freqMap.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = freqMap.get(target-nums[i]);
                Arrays.sort(result);
            }
            freqMap.put(num, i);
        }
        return result;
    }
}
