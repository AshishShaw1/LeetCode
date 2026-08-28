class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, mid, high = arr.length - 1;
        while(low < high){
            mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]) high = mid;
            else low = mid + 1;
        }
        return -1;
    }
}