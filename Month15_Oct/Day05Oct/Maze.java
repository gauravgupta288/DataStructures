package Month15_Oct.Day05Oct;

public class Maze {
    public static void main(String[] args) {
        count("", 2, 2);
    }

    public static void count(String str, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(str);
            return;
        }

        if(row > 1){
            count(str+'D', row - 1, col);
        }

        if(col > 1){
            count(str + 'R', row, col - 1);
        }
    }
}
