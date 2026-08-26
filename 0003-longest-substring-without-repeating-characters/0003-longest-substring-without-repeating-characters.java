class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int i = 0, j = 0;
        int max = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}