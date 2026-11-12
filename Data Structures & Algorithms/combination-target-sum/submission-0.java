class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, 0, target, new ArrayList<>(), nums);
        return list;
    }

    public void dfs(int i, int total, int target, List<Integer> curr, int[] nums) {
        if(total == target) {
            list.add(new ArrayList<>(curr));
            return;
        }
        
        if(total > target) return;
        
        for(int j = i; j < nums.length; j++) {
            curr.add(nums[j]);
            dfs(j, total + nums[j], target, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }
}
