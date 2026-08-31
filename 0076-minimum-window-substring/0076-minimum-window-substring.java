class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int index1 = 0, index2 = 0, min = Integer.MAX_VALUE, i = 0, required = t.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            char right = s.charAt(j);
            if (map.containsKey(right)) {
                if (map.get(right) > 0) {
                    required--;
                }
                map.put(right, map.get(right) - 1);
            }
            while (required == 0) {
                if (j - i + 1 < min) {
                    min = j - i + 1;
                    index1 = i;
                    index2 = j;
                }
                char left = s.charAt(i);
                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);
                    if (map.get(left) > 0) {
                        required++;
                    }
                }
                i++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(index1, index2 + 1);
    }
}