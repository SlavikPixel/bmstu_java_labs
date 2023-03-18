// Определить класс Дробь в виде пары (m,n). Класс должен содержать несколько конструкторов.
// Реализовать методы для сложения, вычитания, умножения и деления дробей.
// Объявить массив из k дробей, ввести/вывести значения для массива дробей.
// Создать массив объектов и передать его в метод,
// который изменяет каждый элемент массива с четным индексом путем добавления следующего за ним элемента массива.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество дробей: ");
        int count = scanner.nextInt();
        Fraction[] fractions = new Fraction[count];

        try {
            for (int i = 0; i < count; i++) {
                System.out.print("Введите числитель дроби №  " + (i+1) + "  ");
                int m = scanner.nextInt();

                System.out.print("Введите знаменатель дроби №  " + (i+1) + "  ");
                int n = scanner.nextInt();

                if (m == 0 || n == 0) {
                    fractions[i] = new Fraction();
                } else {
                    fractions[i] = new Fraction(m, n);
                }
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Недостаточно памяти");
            e.printStackTrace();
        }



        if (count > 1) {
            fractions[0].divide(fractions[1]);
        }

        System.out.println("Введенный массив дробей: ");
        for (int i = 0; i < count; i++) {
            fractions[i].print();
        }

        modifyArray(fractions);

        System.out.println("Полученный массив дробей:");
        for (int i = 0; i < count; i++) {
            fractions[i].print();
        }
    }
    public static void modifyArray(Fraction[] fractions) {
        int count = fractions.length;
        for (int i = 0; i < count; i += 2) {
            if (i+1 < count) {
                fractions[i] = fractions[i].add(fractions[i+1]);
            }
        }
    }
}