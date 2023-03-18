import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка через пробел: ");
        String input = scanner.nextLine();
        String[] items = input.split(" ");
        List<Integer> listArray = new ArrayList<>();
        for (String item : items) {
            listArray.add(Integer.parseInt(item));
        }
        rearrangeList(listArray);
        System.out.println("Переставленный список: " + listArray);
    }

    public static void rearrangeList(List<Integer> listArray) {
        int j = 0;
        for (int i = 0; i < listArray.size(); i++) {
            if (listArray.get(i) < 0) {
                if (i != j) {
                    int temp = listArray.get(i);
                    listArray.set(i, listArray.get(j));
                    listArray.set(j, temp);
                }
                j++;
            }
        }
    }
}