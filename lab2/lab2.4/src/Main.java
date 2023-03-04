import java.util.Random;
import java.util.Scanner;
//  Ввести с консоли n – размерность матрицы a[n][n].
//  Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
//  Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
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

        System.out.println("Введите угол поворота матрицы против часовой стрелки (90, 180, 270): ");
        int angle = scanner.nextInt();

        if (angle == 90 || angle == 180 || angle == 270) {
            int countRotate = angle / 90;
            for (int i = 0; i < countRotate; i++) {
                rotateMatrix90(matrix);
            }
        } else {
            System.out.println("Введен неверный угол, матрица повернута не будет");
        }

        System.out.println("Итоговая матрица: ");
        printMatrix(matrix);
    }
    private static void rotateMatrix90(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n-i-1];
                matrix[j][n-i-1] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[n-j-1][i];
                matrix[n-j-1][i] = temp;
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}