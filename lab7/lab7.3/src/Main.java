import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");

        Set<String> wordSet = new HashSet<>();

        for (String word : words) {
            if (wordSet.contains(word)) {
                continue;
            }
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                wordSet.add(word);
            }
        }

        for (String word : wordSet) {
            System.out.println(word);
        }
    }
}