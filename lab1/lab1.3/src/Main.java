import java.util.Arrays;
import java.util.Scanner;
// Ввести с консоли n целых чисел и поместить их в массив.
// На консоль вывести: все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
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
        arrayFilterPrint(array);
    }
    public static void arrayFilterPrint(int[] array) {
        System.out.println("Filter result: ");
        Arrays.stream(array)
                .filter(elem -> elem > 99 && elem < 1000)
                .filter(elem -> {
                    String el = elem + "";
                    return el.charAt(0) != el.charAt(1)
                            && el.charAt(0) != el.charAt(2)
                            && el.charAt(1) != el.charAt(2)
                            ? true : false;
                })
                .forEach(System.out::println);
    }
}