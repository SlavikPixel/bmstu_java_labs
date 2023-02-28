import java.util.Calendar;
public class Main {
    public static void main(String[] args) {

        String developerLastName = "Gordeev";
        Calendar getTask = Calendar.getInstance();
        Calendar submitTask = Calendar.getInstance();

        getTask.set(2023, 1 , 17, 12, 00,00);

        System.out.printf("Developer name: %s \n", developerLastName);
        System.out.printf("Task received: %s \n", getTask.getTime());
        System.out.printf("Task submitted: %s \n", submitTask.getTime());
    }
}