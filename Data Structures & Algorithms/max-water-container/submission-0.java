class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int area = 0;
        while(i<j){
            int currentArea = (j-i)*Math.min(heights[i], heights[j]);
            area = Math.max(area, currentArea);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }
}
