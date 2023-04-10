import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

// Использовать ТОЛЬКО методы Stream API. Циклов и условий быть не должно.
public class Main {
    public static void main(String[] args) {
        // Задана коллекция строк.
        // Объединить все элементы в одну строку через разделитель “:”
        var strings = Arrays.asList("string1", "string2", "string3");
        var result = strings.stream().collect(Collectors.joining(":"));
        System.out.println(result);


        // Задана коллекция строк. Получить массив уникальных значений.
        strings = Arrays.asList("string1", "string2", "string3", "string2");
        var uniqueList = strings.stream().distinct().collect(Collectors.joining(" "));
        System.out.println(uniqueList);


        // Задана коллекция чисел. Получить сумму четных чисел.
        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var sum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);


        // Задана коллекция чисел. Вычесть из каждого значения 10 и получить среднее.
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .mapToInt(num -> num - 10)
                .average()
                .ifPresent(System.out::println);
    }
}