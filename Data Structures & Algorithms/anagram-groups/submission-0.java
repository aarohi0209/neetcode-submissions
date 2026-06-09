class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anaList = new ArrayList<>();
        Map<String, List<String>> anaMap = new HashMap<>();
        for(String str: strs){
            char []strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);
            if(!anaMap.containsKey(sortedStr)){
                anaMap.put(sortedStr, new ArrayList<>(Arrays.asList(str)));
            }else{
                List<String> current = anaMap.get(sortedStr);
                current.add(str);
                anaMap.put(sortedStr, current);
            }
        }
        anaList.addAll(anaMap.values());
        return anaList;
    }
}
