class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        int start = 0;
        int maxlen = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!indexMap.containsKey(ch)){
                indexMap.put(ch, i);
            }else{
                start = Math.max(start, indexMap.get(ch)+1);
                indexMap.put(ch, i);
            }
            maxlen = Math.max(maxlen, i-start+1);
        }
        return maxlen;
    }
}
