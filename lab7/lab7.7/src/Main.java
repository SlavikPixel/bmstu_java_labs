import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");

        Comparator<String> alphabetComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };

        Arrays.sort(words, alphabetComparator);

        System.out.println("Слова в алфавитном порядке: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}