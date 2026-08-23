int maxArea(int* heights, int size) {
    int left = 0, right = size-1, height = 0, width = 0, current = 0, max = 0;
    while(left < right){
        height = heights[left] < heights[right] ? heights[left] : heights[right];
        width = right - left;
        current = height * width;
        max = max < current ? current : max;
        heights[left] < heights[right] ? left++ : right--;
    }
    return max;
}