class Solution {
    public int[][] change(int matrix[][], int row, int column){
        for(int i=0; i<matrix[row].length; i++){
            if(matrix[row][i] == 0 || matrix[row][i] == -99) continue;
            else matrix[row][i] = -99;
        }
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][column] == 0 || matrix[i][column] == -99) continue;
            else matrix[i][column] = -99;
        }
        return matrix;
    }
    public void setZeroes(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    change(matrix, i, j);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == -99){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}