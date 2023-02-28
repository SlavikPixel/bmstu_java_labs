import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input username: ");
        String username = in.nextLine();
        Hello.Hello(username);
        in.close();
    }
}