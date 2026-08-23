int maximum(int num1, int num2){
    return num1 > num2 ? num1 : num2;
}
int maxSubArray(int* nums, int size) {
    int current = nums[0], max = nums[0];
    for(int i=1; i<size; i++){
        current = maximum(nums[i], current+nums[i]);
        max = maximum(max, current);
    }
    return max;
}