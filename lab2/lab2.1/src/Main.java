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
            if (upperWord(s) && word.equals("")) {
                word = s;
            }
        }
        System.out.println("Слово, символы в котором идут в строгом порядке возрастания их кодов: " + word);

        Date date = new Date();
        System.out.println("Фамилия разработчика: Гордеев");
        System.out.println("Дата и время выдачи задания: 17.02.2023 15:40");
        System.out.println("Дата и время сдачи задания: " + date);
        sc.close();
    }
    public static boolean upperWord(String word) {
        word.chars().forEach(c -> System.out.print(c + " "));
        System.out.println();;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) >= word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}