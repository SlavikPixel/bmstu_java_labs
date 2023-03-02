import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите размерность матрицы ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2*n) - n;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        int norm = 0;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(matrix[i][j]);
            }
            if (sum > norm) {
                norm = sum;
            }
        }
        System.out.println("1 Норма матрицы: " + norm);
    }
}