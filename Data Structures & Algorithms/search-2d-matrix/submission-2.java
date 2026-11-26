class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rl = matrix.length; //row length
        int cl = matrix[0].length; //col length
        int r = 0;
        int c = cl - 1;

        while (r < rl && c >= 0) {
            if (matrix[r][c] > target) {
                c--;
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                return true;
            }
        }
        return false;
    }
}
