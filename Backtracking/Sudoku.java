package Backtracking;

public class Sudoku {
    static boolean check;
    public static void main(String[] args) {
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        solve(board, 0, 0);
        System.out.println(check);
    }

    static void solve(char[][] board, int row, int col){
        if(row == 9){
            check = true;
            return;
        }

        if(board[row][col] == '.'){
                for(char ch = '1'; ch <= '9' ; ch++){
                    if(isValid(board, row, col, ch)){
                        board[row][col] = ch;

                        if(col == 8){
                            solve(board, row + 1, 0);
                        }else{
                            solve(board, row, col + 1);
                        }
                        if(check) return;
                        board[row][col] = '.';

                    }
                }

        }else{
            if(col == 8){
                solve(board, row + 1, 0);
            }else{
                solve(board, row, col + 1);
            }
        }
        return;
    }

     static boolean isValid(char[][] board, int row, int col, char number){

            //check for rows
            for (int i = 0; i < 9; i++) {
                if (number == board[row][i]) {
                    return false;
                }
            }

            //check for columns
            for (int i = 0; i < 9; i++) {
                if (number == board[i][col]) {
                    return false;
                }
            }

            int startR = row - row % 3;
            int startC = col - col % 3;

            for (int i = startR; i < startR + 3; i++) {
                for (int j = startC; j < startC + 3; j++) {
                    if (board[i][j] == number) return false;
                }
            }
        return true;
    }
}
