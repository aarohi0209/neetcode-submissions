class Solution {
    void createPermutation(List<Integer> actual, List<Integer> permute, List<List<Integer>> result){
        int n = actual.size();
        if(n==0){
            if(!result.contains(permute)){
                result.add(new ArrayList(permute));
            }
            return;
        }

        for(int i=0;i<n;i++){
            int x = actual.get(i);
            permute.add(x);
            actual.remove(i);
            createPermutation(actual, permute, result);
            permute.remove(new Integer(x));
            actual.add(i, x);
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //boolean []visited = new boolean[nums.length];
        List<Integer> numList = new ArrayList<>();
        for(int num:nums){
            numList.add(num);
        }
        createPermutation(numList, new ArrayList<>(), result);
        return result;
    }
}
