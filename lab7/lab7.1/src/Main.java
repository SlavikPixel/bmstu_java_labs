import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите подстроку, которая ищется: ");
        String substring = scanner.nextLine();

        System.out.print("Введите слово-вставку: ");
        String insert = scanner.nextLine();

        String[] words = text.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (words[i].endsWith(substring)) {
                result.append(" " + insert);
            }
            result.append(" ");
        }

        System.out.println(result.toString());
    }
}