class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int index = 0, total = 0, i = 0;
        for(int j = 0; j < nums.length; j++){
            total += nums[j];
            while(total >= target){
                if(index == 0 || index > (j - i + 1)){
                    index = j - i + 1;
                }
                total -= nums[i];
                i++;
            }
        }
        return index;
    }
}