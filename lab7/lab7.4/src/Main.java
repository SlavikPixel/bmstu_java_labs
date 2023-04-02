import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");

        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        List<String> longestWords = new ArrayList<>();
        List<String> shortestWords = new ArrayList<>();

        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
            }
            if (length < minLength) {
                minLength = length;
            }
        }

        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }

            if (word.length() == minLength) {
                shortestWords.add(word);
            }
        }

        System.out.print("Слова максимальной длины: ");
        for (String word : longestWords) {
            System.out.print(word + "; ");
        }
        System.out.println();

        System.out.print("Слова минимальной длины: ");
        for (String word : shortestWords) {
            System.out.print(word + "; ");
        }
        System.out.println();
    }
}