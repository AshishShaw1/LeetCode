void sort(int* arr, int size) {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    int j=0;
    for(int i=m; i<nums1Size; i++){
        nums1[i] = nums2[j++];
    }
    sort(nums1, nums1Size);
}