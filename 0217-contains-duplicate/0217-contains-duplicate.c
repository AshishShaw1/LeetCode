void merge(int* nums, int left, int mid, int right) {
    int leftSize = mid - left + 1;
    int rightSize = right - mid;
    
    int* leftArr = (int*)malloc(leftSize * sizeof(int));
    int* rightArr = (int*)malloc(rightSize * sizeof(int));
    
    for (int i = 0; i < leftSize; i++) {
        leftArr[i] = nums[left + i];
    }
    for (int j = 0; j < rightSize; j++) {
        rightArr[j] = nums[mid + 1 + j];
    }
    
    int i = 0, j = 0, k = left;
    
    while (i < leftSize && j < rightSize) {
        if (leftArr[i] <= rightArr[j]) {
            nums[k++] = leftArr[i++];
        } else {
            nums[k++] = rightArr[j++];
        }
    }
    
    while (i < leftSize) {
        nums[k++] = leftArr[i++];
    }
    
    while (j < rightSize) {
        nums[k++] = rightArr[j++];
    }
    
    free(leftArr);
    free(rightArr);
}
void mergeSort(int* nums, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
}
bool containsDuplicate(int* nums, int numsSize) {
    if (numsSize <= 1) {
        return false;
    }
    
    mergeSort(nums, 0, numsSize - 1);

    for(int i=1; i<numsSize; i++)
        if(nums[i-1] == nums[i])
            return true;

    return false;
}