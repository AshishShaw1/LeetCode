int* dailyTemperatures(int* temperatures, int temperaturesSize, int* returnSize) {
    int *result = (int*)calloc(temperaturesSize, sizeof(int));
    int *stack = (int*)malloc(temperaturesSize * sizeof(int));
    int top = -1;
    *returnSize = temperaturesSize;
    for (int i = 1; i < temperaturesSize; i++) {
        if (temperatures[i-1] < temperatures[i]) {
            result[i-1] = i - (i-1);
            while (top >= 0 && temperatures[stack[top]] < temperatures[i]) {
                result[stack[top]] = i - stack[top];
                top--;
            }
        } else {
            stack[++top] = i - 1;
        }
    }
    free(stack);
    return result;
}