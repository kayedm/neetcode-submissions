class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(0, nums.length - 1, nums);
        return nums;    
    }

    public void mergeSort(int l, int r, int[] nums) {
        if(l >= r) return;
        int m = l + (r - l) / 2;
        mergeSort(l, m, nums);
        mergeSort(m + 1, r, nums);
        merge(l, m, r, nums);
    }

    public void merge(int l, int m, int r, int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = l;
        int j = m + 1;
        while(i <= m && j <= r) {
            if(nums[i] < nums[j]) {
                list.add(nums[i]);
                i++;
            } else {
                list.add(nums[j]);
                j++;
            }
        }

        while(i <= m) {
            list.add(nums[i]);
            i++;
        }

        while(j <= r) {
            list.add(nums[j]);
            j++;
        }

        for(int k = 0; k < list.size(); k++) {
            nums[l + k] = list.get(k);
        }
    }
}