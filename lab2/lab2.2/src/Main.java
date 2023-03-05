import java.util.Date;
import java.util.Scanner;
// 1.2	В задании необходимо вывести внизу фамилию разработчика, дату ипше время получения задания, а также дату и время сдачи задания.
// Для получения последней даты и времени следует использовать класс Date.
// Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество слов:");
        int n = sc.nextInt();

        Boolean success = false;
        String result = "";
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (isUnique(s) && !success) {
                result = s;
                success = true;
            }
        }

        System.out.println("Слово, состоящее только из уникальных символов: " + result);

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