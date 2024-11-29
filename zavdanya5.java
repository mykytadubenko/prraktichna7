import java.util.Random;
import java.util.Scanner;

public class zavdanya5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("введіть розмірність квадратної матриці: "); //користувч вводить розмірності квадратної матриці
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size]; //створення заповненої матриці рандомними значеннями
        System.out.println("згенерована матриця:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(100); //рандомні числа від 0 до 100
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transMatrix = new int[size][size]; //обчислення транспонованої матриці
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("транспонована матриця:"); //виводимо транспоновану матрицю
        for (int[] row : transMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
