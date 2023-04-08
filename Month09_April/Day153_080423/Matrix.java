package Month09_April.Day153_080423;

import java.util.Scanner;

class Matrix {

    int[][] array;
    int rows, columns;
    // Define constructor here
    Matrix(){

    }
    Matrix(int r, int c){
        rows = r;
        columns = c;
        array = new int[rows][columns];
    }

    void input(Scanner sc){
        // Use the Scanner object passed as argument for taking input and not a new Scanner object
        // Complete the function

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

    }

    Matrix add(Matrix x){
        // Complete the function
        int res[][] = new int[rows][columns];
        Matrix k = new Matrix(rows, columns);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j< columns; j++){
                k.array[i][j] = array[i][j] + x.array[i][j];
            }
        }

        return k;
    }

    Matrix subtract(Matrix x){
        // Complete the function
        int res[][] = new int[rows][columns];
        Matrix k = new Matrix(rows, columns);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j< columns; j++){
                k.array[i][j] = array[i][j] - x.array[i][j];
            }
        }

        return k;
    }

    Matrix transpose(){
        // Complete the function
        Matrix k = new Matrix(columns, rows);
        int[][] transposed = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                k.array[j][i] = array[i][j];
            }
        }
        return k;
    }

    void print(){
        // Complete the function
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print( array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        Matrix m = new Matrix(2,2);
        m.input(sc);
        Matrix m1 = new Matrix(2,2);
        m1.input(sc);

        Matrix m2 = m.add(m1);


    }
}
