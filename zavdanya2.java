import java.util.Random;

public class zavdanya2 {
    public static void main(String[] args) {
        int rows = 4; //кільк. рядків
        int cols = 5; //кільк. стовпчиків
        double[][] array = new double[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) { //генерація масиву з випадковими числами
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextDouble() * 100; //числа в діапазоні від 0 до 100
            }
        }

        System.out.println("вихідний масив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) { //обробка масиву
            for (int j = 0; j < cols; j++) {
                if (i % 2 != 0 || j % 2 != 0) { //непарний індекс рядка (i) та стовпця(j)
                    array[i][j] = Math.sqrt(array[i][j]);
                }
            }
        }

        System.out.println("оброблений масив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}