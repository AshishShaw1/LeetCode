class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tmap = new HashMap<Character, Integer>();
        for(char sch : s.toCharArray()){
            smap.put(sch, smap.getOrDefault(sch, 0) + 1);
        }
        for(char tch : t.toCharArray()){
            tmap.put(tch, tmap.getOrDefault(tch, 0) + 1);
        }
        if(smap.equals(tmap)) {
            return true;
        }
        return false;
    }
}