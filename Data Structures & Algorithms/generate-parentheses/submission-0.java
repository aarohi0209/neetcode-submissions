class Solution {
    public void generateValidParenthesis(int open, int close, String current, List<String> result){
        if((open== close) && (open == 0 && close == 0)){
            result.add(current);
            return;
        }
        if(open <0 || close <0){
            return;
        }
        if(open < close){
            generateValidParenthesis(open-1, close, current + "(", result);
            //current.remove("(");
            generateValidParenthesis(open, close-1, current + ")", result);
            //current.remove(")");
        }else{
            generateValidParenthesis(open-1, close, current + "(", result);
            //current.remove("(");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateValidParenthesis(n, n, "", result);
        return result;
    }
}
