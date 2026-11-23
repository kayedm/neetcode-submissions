class Solution {
    List<List<Integer>> list;

    public List<List<Integer>> fourSum(int[] nums, int target) {
        list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, 0L, target, new ArrayList<>(), nums);
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
            if (nums.length - j < 4 - curr.size()) break; // not enough elements left

            curr.add(nums[j]);
            dfs(j + 1, total + nums[j], target, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }
}