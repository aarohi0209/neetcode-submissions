class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty() || strs == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append("*");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if(str == null){
            return result;
        }else if(str.isEmpty()){
            return Arrays.asList("");
        }else{
            int i = 0;
            int len = 0;
            while(i<str.length()){
                int index = str.indexOf('*', i);
                len = Integer.parseInt(str.substring(i, index));
                String current = str.substring(index+1, index+1+len);
                i = index+1+len;
                result.add(current);
            }
        }
        return result;
    }
}
