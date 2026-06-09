class Solution {
    public void getCurrentMapping(Queue<String> ansQueue, String current) {
        int size = ansQueue.size(); 
        for (int j = 0; j < size; j++) {
            String top = ansQueue.poll();
            for (int i = 0; i < current.length(); i++) {
                String currentAns = top + current.charAt(i);
                ansQueue.offer(currentAns.trim());
            }
        }
    }

    public void getCurrentMappingList(List<String> ansList, String current) {
        int size = ansList.size(); 
        for (int i = 0; i < size; i++) {
            String top = ansList.get(i);
            for (int j = 0; j < current.length(); j++) {
                String currentAns = top + current.charAt(j);
                ansList.add(currentAns.trim());
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits==null || digits.length()==0){
            return result;
        }
        String []letters = new String [] {"abc", "def", "ghi", "jkl", "mno", "pqrs","tuv","wxyz"};
        //Queue<String> resultQueue = new  LinkedList<>();
        //List<String> resultList = new ArrayList<>();
        String ans = "";
        //resultQueue.add(ans);
        result.add(ans);
        for(int i=0;i<digits.length();i++){
            char ch = digits.charAt(i);
            int num = ch -'0';
            String current = letters[num-2];
            //getCurrentMapping(resultQueue, current);
            List<String> resultList = new ArrayList<>();
            for (String str: result) {
                for (int j = 0; j < current.length(); j++) {
                    String currentAns = str + current.charAt(j);
                    resultList.add(currentAns.trim());
                }
            }
            result = resultList;
        }
        //result.addAll(resultQueue);
        return result;
    }
}
