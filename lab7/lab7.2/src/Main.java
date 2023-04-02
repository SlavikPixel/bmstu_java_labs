import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите символ для удаления или вставки: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Введите признак действия (0 для удаления, 1 для вставки): ");
        int action = scanner.nextInt();

        // Если вставляем, то задаем позицию
        int position = -1;
        if (action == 1) {
            System.out.print("Введите позицию для вставки символа: ");
            position = scanner.nextInt();
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (action == 0 && c == symbol) {
                continue;
            } else {
                result.append(c);
            }
        }
        if (action == 1) result.insert(position + 1, symbol);
        System.out.println(result.toString());
    }
}