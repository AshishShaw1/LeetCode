typedef struct {
    int key;
    int value;
    int used;
} Entry;
int majorityElement(int* nums, int numsSize) {
    if (numsSize == 1) {
        return nums[0];
    }
    int capacity = numsSize * 2;
    Entry* map = (Entry*)calloc(capacity, sizeof(Entry));
    for (int i = 0; i < numsSize; i++) {
        int num = nums[i];
        unsigned int idx = ((unsigned int)num) % capacity;
        while (map[idx].used && map[idx].key != num) {
            idx = (idx + 1) % capacity;
        }
        map[idx].key = num;
        map[idx].value++;
        map[idx].used = 1;
    }
    int majorityKey = -1;
    int majorityValue = numsSize / 2;
    for (int i = 0; i < capacity; i++) {
        if (map[i].used && map[i].value > majorityValue) {
            majorityKey = map[i].key;
            break;
        }
    }
    free(map);
    return majorityKey;
}