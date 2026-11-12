class Solution {
    private void helper(int candidates[], int target, List<Integer> list, List<List<Integer>> ans, int sum, int index){
        if(sum > target) return;
        if(sum == target){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=index; i<candidates.length; i++){
            list.add(candidates[i]);
            sum += candidates[i];
            helper(candidates, target, list, ans, sum, i);
            list.remove(list.size() - 1);
            sum -= candidates[i];
        }
    }
    public List<List<Integer>> combinationSum(int candidates[], int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, new ArrayList<Integer>(), ans, 0, 0);
        return ans;
    }
}