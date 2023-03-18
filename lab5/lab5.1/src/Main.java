//	Определить класс Цепная дробь.
//	Определить методы сложения, вычитания, умножения, деления.
//	Вычислить значение для заданного n, x, a[n].
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ChainFraction chainFraction1 = null;
        ChainFraction chainFraction2 = null;
        try {
            chainFraction1 = createChainFraction();
        } catch (OutOfMemoryError e) {
            System.err.println("Недостаточно памяти для выполнения операции создания первой дроби");
            e.printStackTrace();
        }

        try {
            chainFraction2 = createChainFraction();
        } catch (OutOfMemoryError e) {
            System.err.println("Недостаточно памяти для выполнения операции создания второй дроби");
            e.printStackTrace();
        }

        if (chainFraction1 != null && chainFraction2 != null) {
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
        } else {
            throw new NullPointerException("Дробь или дроби не инициализированны");
        }


    }

    public static ChainFraction createChainFraction() throws OutOfMemoryError {
        System.out.print("Введите n - количество коэфициентов: ");
        int n = readInt();
        if (n < 1) throw new InputMismatchException("Неверный ввод кол-ва коэфициентов");
        System.out.print("Введите x - числитель цепной дроби: ");
        int x = readInt();

        double[] a = new double[n];
        System.out.println("Введите a[n] - коэфициенты: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Введите коэфициент № " + (i+1) + "  ");
            a[i] = readInt();
        }
        ChainFraction chain = new ChainFraction(x, n, a);
        return chain;
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            try {
                n = Integer.parseInt(scanner.next());
                System.out.println("Ваше число : " + n);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Неверный ввод, попробуйте еще раз: ");
            }
        }
        return n;
    }
}

