class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int low = 0, mid, high = nums.length - 1;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(mid == 0 && nums[0] != nums[1]) return nums[mid];
            else if(mid == nums.length - 1 && nums[mid] != nums[mid - 1]) return nums[mid];
            else if(nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]) return nums[mid];
            else if(mid % 2 == 0){
                if(nums[mid - 1] == nums[mid]) high = mid - 1;
                else low = mid + 1;
            }else{
                if(nums[mid - 1] == nums[mid]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}