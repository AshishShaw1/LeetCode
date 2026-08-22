bool search(int *arr, int arrSize, int target) {
    for (int i = 0; i < arrSize; i++) {
        if (arr[i] == target) {
            return true;
        }
    }
    return false;
}
int* findMissingAndRepeatedValues(int** grid, int gridSize, int* gridColSize, int* returnSize) {
    int size = gridSize * gridSize;
    int *arr = (int*)malloc(size * sizeof(int));
    int *ans = (int*)calloc(2, sizeof(int));
    int *count = (int*)calloc(size + 1, sizeof(int));
    for (int i = 0; i < size; i++) {
        arr[i] = i + 1;
    }
    for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridColSize[i]; j++) {
            bool result = search(arr, size, grid[i][j]);
            if (result == true) {
                count[grid[i][j]]++;
            }
        }
    }
    for (int i = 0; i < size; i++) {
        int val = arr[i];
        int freq = count[val];
        if (freq == 2) {
            ans[0] = val;
        } else if (freq == 0) {
            ans[1] = val;
        }
    }
    free(arr);
    free(count);
    *returnSize = 2;
    return ans;
}