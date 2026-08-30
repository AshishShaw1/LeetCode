class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Store sorted version of every string
        String[] str = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            str[i] = new String(chars);
        }
        /*HashMap:
        key   = sorted string
        value = group of original strings*/
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String key = str[i];
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        // Convert all groups into the required result
        return new ArrayList<>(map.values());
    }
}