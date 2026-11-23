class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, 0, target, new ArrayList<>(), nums);
        return list;
    }
    public void dfs(int i, long total, int target, List<Integer> curr, int[] nums) {
        if (curr.size() == 4) {
            if (total == target) {
                list.add(new ArrayList<>(curr));
            }
            return;
        }

        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
            curr.add(nums[j]);
            dfs(j + 1, total + nums[j], target, curr, nums);
            curr.removeLast();
        }
    }
}