class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j, window = k;
        double sum = 0.0, average = Double.NEGATIVE_INFINITY;
        for(j=0; j<nums.length; j++){
            sum +=nums[j];
            window--;
            if(window == 0){
                if(i > 0){
                    sum -= nums[i-1];
                }
                if((sum / k) > average){
                    average = sum / k;
                }
                i++;
                window++;
            }
        }
        return average;
    }
}