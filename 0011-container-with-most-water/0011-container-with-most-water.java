class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length-1, current_water = 0, max_water = 0, height = 0, width = 0;
        while(i < j){
            if(heights[i] < heights[j]){
                height = Math.min(heights[i], heights[j]);
                width = j - i;
                current_water = height * width;
                if(max_water < current_water){
                    max_water = current_water;
                }
                i++;
            }else{
                height = Math.min(heights[i], heights[j]);
                width = j - i;
                current_water = height * width;
                if(max_water < current_water){
                    max_water = current_water;
                }
                j--;
            }
        }
        return max_water;
    }
}