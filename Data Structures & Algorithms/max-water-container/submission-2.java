class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

            while(left < right) {
                int tempHeight = Math.min(heights[left], heights[right]);
                int tempWidth = right - left;
                int tempVol = tempHeight * tempWidth;

                if(max < tempVol) {
                    max = tempVol;
                }

                if(heights[left] < heights[right]) {
                    left++;
                } else {
                    right--;
                }

            }

        return max;
    }
}
