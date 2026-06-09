class Solution {
    public void backTrackSum(int [][]dp, int[]nums, int i, int j, List<Integer> sumList, List<List<Integer>> result){
        if(j==0){
             result.add(new ArrayList<>(sumList));
             return;
        }
        if(i==0){
            return;
        }
        if(j>=nums[i-1] && dp[i][j-nums[i-1]]>0){
            sumList.add(nums[i-1]);
            backTrackSum(dp, nums, i, j-nums[i-1], sumList, result);
            sumList.remove(sumList.size()-1);
        }
        if(dp[i-1][j]>0){
            backTrackSum(dp, nums, i-1, j, sumList, result);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int [][]dp = new int[nums.length+1][target+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(j>=nums[i-1]){
                    dp[i][j] = dp[i-1][j] + dp[i][j-nums[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        backTrackSum(dp, nums, dp.length-1, dp[0].length-1, new ArrayList<>(), result);
        return result;
    }
}
