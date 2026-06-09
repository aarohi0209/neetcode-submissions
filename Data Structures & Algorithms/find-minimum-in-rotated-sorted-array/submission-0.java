class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(nums[0]<=nums[n-1]){
            return nums[0];
        }

        int left=0;
        int right = n-1;
        int min = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]<min){
                min = nums[mid];
            }else if(nums[0]<=nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return min;
    }
}
