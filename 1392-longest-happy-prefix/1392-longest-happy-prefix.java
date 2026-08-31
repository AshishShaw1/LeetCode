class Solution {
    public String longestPrefix(String s) {
        char[] arr = s.toCharArray();
        int[] lps = new int[s.length()];
        int i = 0;
        int j = 1; 
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                lps[j] = ++i;
                j++;
            } else {
                if (i == 0) {
                    lps[j++] = 0;
                } else {
                    i = lps[i - 1];
                }
            }
        }
        if (lps[arr.length - 1] == 0)
            return "";
        int start = arr.length - lps[arr.length - 1];
        return s.substring(start, arr.length);
    }
}