import java.util.Scanner;
// Создать класс Hello, который будет приветствовать любого пользователя, используя командную строку.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input username: ");
        String username = in.nextLine();
        Hello.Hello(username);
        in.close();
    }
}