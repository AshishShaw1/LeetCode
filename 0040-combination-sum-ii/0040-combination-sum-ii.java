class Solution {
    private void helper(int candidates[], int target, List<Integer> list, List<List<Integer>> ans, int sum, int index){
        if(sum > target) return;
        if(sum == target){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum + candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            sum += candidates[i];
            helper(candidates, target, list, ans, sum, i + 1);
            list.remove(list.size() - 1);
            sum -= candidates[i];
        }
    }
    public List<List<Integer>> combinationSum2(int candidates[], int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, new ArrayList<Integer>(), ans, 0, 0);
        return ans;
    }
}