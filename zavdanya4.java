import java.util.Random;
import java.util.Scanner;

public class zavdanya4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("введіть кількість рядків матриці: "); //користувач вводить розмір матриці
        int rows = scanner.nextInt();
        System.out.print("введіть кількість стовпців матриці: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols]; //будування та заповнення матриці рандомними значеннями
        System.out.println("згенерована матриця:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100); //рандомне число від 0 до 100
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("віведіть номер рядка: (0-" + (rows - 1) + "): "); //користувач вводить елемент для мінору
        int roww = scanner.nextInt();
        System.out.print("введіть номер стовпця: (0-" + (cols - 1) + "): ");
        int coll = scanner.nextInt();

        int[][] minor = new int[rows - 1][cols - 1]; //обчислення мінору
        int r = 0;
        for (int i = 0; i < rows; i++) {
            if (i == roww) continue;
            int c = 0;
            for (int j = 0; j < cols; j++) {
                if (j == coll) continue;
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }

        System.out.println("мінор матриці:"); //відповдь
        for (int[] row : minor) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
