class Solution {
    void generateSubsets(List<List<Integer>> result, List<Integer> subset, int[]nums, int start){
        if(start>=nums.length){
            result.add(new ArrayList(subset));
            return;
        }

        generateSubsets(result, subset, nums, start+1);
        subset.add(nums[start]);
        generateSubsets(result, subset, nums, start+1);
        subset.remove(new Integer(nums[start]));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(result, new ArrayList<>(), nums, 0);
        return result;
    }
}
