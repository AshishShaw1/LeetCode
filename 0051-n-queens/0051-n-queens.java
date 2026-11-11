class Solution {
    private boolean isSafe(List<List<String>> board, int row, int column){
        //Horizontal Checking
        for(int i=0; i<board.get(row).size(); i++){
            if(board.get(row).get(i).equals("Q")){
                return false;
            }
        }
        //Vertical Checking
        for(int i=0; i<board.size(); i++){
            if(board.get(i).get(column).equals("Q")){
                return false;
            }
        }
        //Left Diagonal Checking
        for(int i=row, j=column; i>=0 && j>=0; i--, j--){
            if(board.get(i).get(j).equals("Q")){
                return false;
            }
        }
        //Right Diagonal Checking
        for(int i=row, j=column; i>=0 && j<board.get(0).size(); i--, j++){
            if(board.get(i).get(j).equals("Q")){
                return false;
            }
        }
        return true;
    }
    private void calculate(List<List<String>> board, List<List<String>> answer, int row, int queens){
        if(row >= board.size()){
            List<String> temp = new ArrayList<>();
            for(int i=0; i<board.size(); i++){
                temp.add(String.join("", board.get(i)));
            }
            answer.add(temp);
            return;
        }else{
            for(int i=0; i<board.get(0).size(); i++){
                if(isSafe(board, row, i)){
                    board.get(row).set(i, "Q");
                    calculate(board, answer, row+1, queens);
                    board.get(row).set(i, ".");
                }
            }
        }
    }
    public List<List<String>> solveNQueens(int queens) {
        List<List<String>> board = new ArrayList<>();
        List<List<String>> answer = new ArrayList<>();
        for(int i=0; i<queens; i++){
            List<String> row = new ArrayList<>();
            for(int j=0; j<queens; j++){
                row.add(".");
            }
            board.add(row);
        }
        calculate(board, answer, 0, queens);
        return answer;
    }
}
