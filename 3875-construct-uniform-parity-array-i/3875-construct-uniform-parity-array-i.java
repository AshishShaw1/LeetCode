class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean even = false, odd = false;
        // Checking for even numbers
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 == 0){
                even = true;
            }else{
                even = false;
            }
        }
        // If all elements are even return true
        if(even == true) return true;
        // Checking for odd numbers
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 != 0){
                odd = true;
            }else{
                odd = false;
            }
        }
        // If all elements are odd return true
        if(odd == true) return true;
        // If array contains even and odd numbers both
        int odd_Index = -1;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 != 0){
                odd_Index = i;
                break;
            }
        }
        // Converting all elements of array to odd as it have both even and odd numbers
        int nums2[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 == 0){
                nums2[i] = nums1[i] - nums1[odd_Index];
            }else{
                nums2[i] = nums1[i];
            }
        }
        // Checking if nums2 have all elements odd if yes then returning true else returning false
        boolean all_Odd = false;
        for(int i=0; i<nums2.length; i++){
            if(nums2[i] % 2 != 0){
                all_Odd = true;
            }else{
                all_Odd = false;
            }
        }
        return all_Odd;
    }
}