import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество слов:");
        int n = sc.nextInt();

        String word = "";
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (isUnique(s) && word.equals("")) {
                word = s;
            }
        }

        System.out.println("Слово, состоящее только из уникальных символов: " + word);

        Date date = new Date();
        System.out.println("Фамилия разработчика: Гордеев");
        System.out.println("Дата и время выдачи задания: 17.02.2023 15:40");
        System.out.println("Дата и время сдачи задания: " + date);
        sc.close();
    }
    public static boolean isUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) != word.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
}