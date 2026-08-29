class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }
}