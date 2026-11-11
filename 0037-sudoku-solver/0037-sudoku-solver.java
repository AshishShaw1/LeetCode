class Solution {
    private boolean isSafe(char board[][], int row, int column, char digit){
        //Horizontal Checking
        for(int i=0; i<9; i++){
            if(board[row][i] == digit){
                return false;
            }
        }
        //Vertical Checking
        for(int i=0; i<9; i++){
            if(board[i][column] == digit){
                return false;
            }
        }
        //Grid Checking
        int startingRow = (row / 3) * 3, startingColumn = (column / 3) * 3;
        for(int i=startingRow; i<=startingRow + 2; i++){
            for(int j=startingColumn; j<=startingColumn + 2; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean helper(char board[][], int row, int column){
        if(row == 9){
            return true;
        }
        int nextRow = row, nextColumn = column + 1;
        if(nextColumn == 9){
            nextRow = row + 1;
            nextColumn = 0;
        }
        if(board[row][column] != '.'){
            return helper(board, nextRow, nextColumn);
        }
        for(char digit='1'; digit<='9'; digit++){
            if(isSafe(board, row, column, digit)){
                board[row][column] = digit;
                if(helper(board, nextRow, nextColumn)){
                    return true;
                }
                board[row][column] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char board[][]) {
        helper(board, 0, 0);
    }
}