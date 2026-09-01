class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anaMap = new HashMap<>();
        for(String str: strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sorted = new String(strArr);
            if(!anaMap.containsKey(sorted)){
                anaMap.put(sorted, new ArrayList<>(List.of(str)));
            }else{
                List<String> current = anaMap.get(sorted);
                current.add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();
        result.addAll(anaMap.values());
        return result;
    }
}
