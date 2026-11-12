class Solution {
    private boolean isPalindrome(String string, int left, int right) {
        while (left < right) {
            if (string.charAt(left) == string.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    private void backtrack(String string, List<String> list, List<List<String>> ans, int index){
        if(index < string.length()){
            for(int i=index; i<string.length(); i++){
                if(isPalindrome(string, index, i)){
                    list.add(string.substring(index, i + 1));
                    backtrack(string, list, ans, i + 1);
                    list.remove(list.size() - 1);
                }
            }
        }else{
            ans.add(new ArrayList<String>(list));
        }
    }
    public List<List<String>> partition(String string) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(string, new ArrayList<String>(), ans, 0);
        return ans;
    }
}