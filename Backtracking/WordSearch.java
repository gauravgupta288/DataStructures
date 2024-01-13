package Backtracking;

public class WordSearch {
    static boolean check;

    public static void main(String[] args) {
        System.out.println(solve(new boolean[2][2], new char[][]{{'a','b'}, {'c','d'}}, "abcd", 0,0,0));

    }

    public static boolean solve(boolean arr[][], char[][] board, String word, int index, int row, int col){

        if(word.length() == 1 && board.length == 1 && board[0].length == 1){
            if(word.charAt(0) == board[0][0]){
                return true;
            }else{
                return false;
            }
        }
        if(index >= word.length()){
            check = true;
            return true;
        }

        if(row < 0 || row > board.length - 1 || col < 0 || col > board[0].length - 1) return false;

        if(!arr[row][col] && word.charAt(index) == board[row][col]){
            arr[row][col] = true;
            if(row > 0){
                solve(arr, board, word, index + 1, row - 1, col);
            }

            if(row < board.length - 1){
                solve(arr, board, word, index + 1, row + 1, col);
            }

            if(col > 0){
                solve(arr, board, word, index + 1, row, col - 1);
            }

            if(col < board[0].length - 1){
                solve(arr, board, word, index + 1, row, col + 1);
            }

            arr[row][col] = false;

        }else{
            if(col >= board[0].length - 1){
                solve(arr, board, word, index, row+1, 0);
            }else{
                solve(arr, board, word, index, row, col+1);
            }
        }

        return check;
    }
}
