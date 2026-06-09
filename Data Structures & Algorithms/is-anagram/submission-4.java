class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        /*Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            sMap.put(ch1, sMap.getOrDefault(ch1, 0)+1);
            tMap.put(ch2, tMap.getOrDefault(ch2, 0)+1);
        }

        for(char ch: sMap.keySet()){
            if(!tMap.containsKey(ch) || !sMap.get(ch).equals(tMap.get(ch))){
                return false;
            }
        }*/

        int charArray[] = new int[26];
        for(int i=0; i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            charArray[ch1-'a']++;
            charArray[ch2-'a']--;
        }
        for(int num: charArray){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
