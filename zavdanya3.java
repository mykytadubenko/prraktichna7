import java.util.Scanner;

public class zavdanya3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5]; //будвання матриці 5x5 (matrix - матриця)
        System.out.println("введіть елементи матриці 5 на 5:");

        for (int i = 0; i < matrix.length; i++) { //користувач заповнює матрицю
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }


        System.out.println("введена матриця:"); //виводимо матрицю, яку заповнив користувач
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int result = 0; //розрахунок визначника (determiner - визначник)
        for (int col = 0; col < 5; col++) {
            int determiner = 1;
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j != col) {
                        determiner *= matrix[i][j];
                    }
                }
            }
            if (col % 2 == 0) {
                result += matrix[0][col] * determiner;
            } else {
                result -= matrix[0][col] * determiner;
            }
        }

        System.out.println("визначник матриці: " + result); //відповідь
    }
}