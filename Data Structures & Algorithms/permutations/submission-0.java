class Solution {
    void createPermutation(List<Integer> actual, List<Integer> permute, List<List<Integer>> result, boolean []visited){
        if(permute.size()>=actual.size()){
            if(!result.contains(permute)){
                result.add(new ArrayList(permute));
            }
            return;
        }

        for(int i=0;i<actual.size();i++){
            if(!visited[i]){
                int x = actual.get(i);
                permute.add(x);
                visited[i] = true;
                createPermutation(actual, permute, result, visited);
                permute.remove(permute.size()-1);
                visited[i] = false;
            }
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean []visited = new boolean[nums.length];
        List<Integer> numList = new ArrayList<>();
        for(int num:nums){
            numList.add(num);
        }
        createPermutation(numList, new ArrayList<>(), result, visited);
        return result;
    }
}
