package Backtracking;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println(solve(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED", 0,0,0));
    }

    public static boolean solve(char[][] board, String word, int index, int row, int col){

        if(index >= word.length()){
            return true;
        }

        if(word.charAt(index) == board[row][col]){

            if(row > 0){
                solve(board, word, index + 1, row - 1, col);
            }

            if(row < board.length - 1){
                solve(board, word, index + 1, row + 1, col);
            }

            if(col > 0){
                solve(board, word, index + 1, row, col - 1);
            }

            if(col < board[0].length - 1){
                solve(board, word, index + 1, row, col + 1);
            }
        }

        return false;
    }
}
