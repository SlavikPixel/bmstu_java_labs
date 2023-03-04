import java.util.Arrays;
import java.util.Scanner;
//	Ввести с консоли n целых чисел и поместить их в массив.
//	На консоль вывести: наибольший общий делитель и наименьшее общее кратное этих чисел
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of elements in Array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Input elements: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int nod = Arrays.stream(array).reduce(array[0], (x, y) -> NOD(x, y));
        int nok = Arrays.stream(array).reduce(array[0], (x, y) -> NOK(x, y));

        System.out.println("Наибольший общий делитель: " + nod);
        System.out.println("Наименьшее общее кратное: " + nok);
    }

    public static int NOD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int NOK(int a, int b) {
        return (a * b) / NOD(a,b);
    }
}