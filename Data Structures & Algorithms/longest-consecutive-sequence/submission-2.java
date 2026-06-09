class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int maxlen = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            int prev = nums[i-1];
            int curr = nums[i];
            if(curr == prev+1){
                count++;
            }else if(curr == prev){
                continue;
            }else{
                count = 1;
            }
            maxlen = Math.max(maxlen, count);
        }
        return maxlen;
    }
}
