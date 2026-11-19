class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < 9; r++) {
            Set<Character> set = new HashSet<>();
            for(int c = 0; c < 9; c++) {
                if(board[r][c] == '.') continue;
                if(!set.add(board[r][c])) return false;
            }
        }

        for(int c = 0; c < 9; c++) {
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < 9; i++) {
                if(board[i][c] == '.') continue;
                if(!set.add(board[i][c])) return false;
            }
        }
        for(int s = 0; s < 9; s++) { 
            Set<Character> set = new HashSet<>();
            for(int r = 0; r < 3; r++) {
                for(int c = 0; c < 3; c++) {
                    int row = (s / 3) * 3 + r;
                    int col = (s % 3) * 3 + c;
                    if(board[row][col] == '.') continue;
                    if(!set.add(board[row][col])) return false;
                }
            }
        }
        return true;
    }
}
