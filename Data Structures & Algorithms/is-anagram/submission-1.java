class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> charMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            charMap.put(ch1, charMap.getOrDefault(ch1, 0)+1);
            charMap.put(ch2, charMap.getOrDefault(ch2, 0)-1);
        }

        for(char ch: charMap.keySet()){
            if(charMap.get(ch)!=0){
                return false;
            }
        }
        return true;
    }
}
