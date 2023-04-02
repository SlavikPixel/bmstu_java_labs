import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        String lastWord = words[words.length - 1];

        for (int i = words.length - 1; i >= 1; i--) {
            words[i] = words[i - 1];
        }

        words[0] = lastWord;

        String result = String.join(" ", words);
        System.out.println("Преобразованное предложение: " + result);
    }
}