class Solution{
    public int maxDistinct(String s){
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        return set.size();
    }
}