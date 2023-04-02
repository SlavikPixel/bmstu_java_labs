import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        StringBuilder resultText = new StringBuilder();

        int n = text.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j += 3) {
                resultText.append(text.charAt(j));
            }
        }

        System.out.println("Зашифрованный текст: " + resultText.toString());
    }
}