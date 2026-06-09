class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*int i=0;
        int j=nums.length-1;
        int []result = new int[2];

        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                result[0]=i;
                result[1]=j;
                return result;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }*/
        int []result = new int[2];
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freqMap.containsKey(target - nums[i])){
                result[0] = freqMap.get(target - nums[i]);
                result[1] = i;
                break;
            }
            freqMap.put(nums[i], i);
        }
        Arrays.sort(result);
        return result;
    }
}
