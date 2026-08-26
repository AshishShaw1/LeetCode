class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        int result[][] = new int[intervals.length][2];
        int count = 0;
        result[count][0] = intervals[0][0];
        result[count][1] = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (result[count][1] >= intervals[i][0]) {
                result[count][1] = Math.max(result[count][1], intervals[i][1]);
            } else {
                count++;
                result[count][0] = intervals[i][0];
                result[count][1] = intervals[i][1];
            }
        }
        return Arrays.copyOf(result, count + 1);
    }
}