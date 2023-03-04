//	Определить класс Цепная дробь.
//	Определить методы сложения, вычитания, умножения, деления.
//	Вычислить значение для заданного n, x, a[n].
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ChainFraction chainFraction1 = createChainFraction();
        ChainFraction chainFraction2 = createChainFraction();

        double resultOfAdd = chainFraction1.add(chainFraction2);
        double resultOfSubtract = chainFraction1.subtract(chainFraction2);
        double resultOfMultiply = chainFraction1.multiply(chainFraction2);
        double resultOfDivide = chainFraction1.divide(chainFraction2);

        System.out.println("Значение первой цепной дроби: " + chainFraction1.getValue());
        System.out.println("Значение второй цепной дроби: " + chainFraction2.getValue());

        System.out.println("Результат сложения двух цепных дробей: " + resultOfAdd);
        System.out.println("Результат вычитания двух цепных дробей: " + resultOfSubtract);
        System.out.println("Результат умножения двух цепных дробей: " + resultOfMultiply);
        System.out.println("Результат деления двух цепных дробей: " + resultOfDivide);
    }

    public static ChainFraction createChainFraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n - количество коэфициентов: ");
        int n = scanner.nextInt();

        System.out.print("Введите x - числитель цепной дроби: ");
        int x = scanner.nextInt();

        double[] a = new double[n];
        System.out.println("Введите a[n] - коэфициенты: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Введите коэфициент № " + (i+1) + "  ");
            a[i] = scanner.nextInt();
        }

        return new ChainFraction(x, n, a);
    }
}