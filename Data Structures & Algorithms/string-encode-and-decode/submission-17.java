class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for(String str: strs){
            result.append(str.length());
            result.append("#");
            result.append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> resultList = new ArrayList<>();
        if (str == null) {
            return resultList;
        }

        if (str.isEmpty()) {
            return Arrays.asList("");
        }

        int i = 0;
        int len = 0;

        //System.out.println(str);
        while(i<str.length()){
            int index = str.indexOf('#', i);
            len = Integer.parseInt(str.substring(i, index));
            //System.out.println("Length:"+len+"Index:"+index);
            String current = str.substring(index+1, index+1+len);
            //System.out.println(current);
            i = index+1+len;
            resultList.add(current);
        }

        return resultList;
    }
}
