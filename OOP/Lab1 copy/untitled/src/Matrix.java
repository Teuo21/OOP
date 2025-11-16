import java.util.Random;
public class Matrix {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(101);

        System.out.println("Matrix: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }

        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }
}
