class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashnum = new HashSet<>();

        for(int i : nums) {
            hashnum.add(i);
        }

        if(nums.length == hashnum.size()) {
            return false;
        }

        return true;
    }
}