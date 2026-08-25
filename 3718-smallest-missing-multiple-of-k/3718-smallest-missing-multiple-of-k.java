class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> seen = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            seen.add(nums[i]);
        }
        for(int i=1 ; ; i++){
            if(!seen.contains(i * k)){
                return i * k;
            }
        }
    }
}