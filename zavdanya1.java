public class zavdanya1 {
    public static void main(String[] args) {
        int rows = 5;

        int[][] pyramid = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("звичайна піраміда:"); //виведення масиву у вигляді піраміди у звичайному порядку
        for (int i = 0; i < pyramid.length; i++) {
            for (int space = 0; space < pyramid.length - i - 1; space++) {
                System.out.print("  "); //пробіли для вирівнювання
            }
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("зворотна піраміда:"); //виведення масиву у вигляді піраміди у зворотньому порядку
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int space = 0; space < pyramid.length - i - 1; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
