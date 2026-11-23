class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0 , 1);
        for(int n : nums) {
            currSum += n;
            int diff = currSum - k;
            res += map.getOrDefault(diff, 0);
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return res;
    }
}