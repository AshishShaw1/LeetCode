class Solution {
    public boolean uniformArray(int[] nums1) {
        // Checking if all elements are even
        boolean even = true;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                even = false;
                break;
            }
        }
        if (even) return true;
        // Checking if all elements are odd
        boolean odd = true;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0) {
                odd = false;
                break;
            }
        }
        if (odd) return true;
        int minOdd = Integer.MAX_VALUE;
        // Find the smallest odd number
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                minOdd = Math.min(minOdd, nums1[i]);
            }
        }
        // If there is an odd number, every even number must be greater than the smallest odd
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0 && minOdd != Integer.MAX_VALUE && nums1[i] < minOdd) {
                return false;
            }
        }
        return true;
    }
}