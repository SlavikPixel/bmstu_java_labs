import java.util.Calendar;
// Создать приложение, выводящее фамилию разработчика, дату и время получения задания,
// а также дату и время сдачи задания.
// Для получения последней даты и времени использовать класс Calendar из пакета java.util
public class Main {
    public static void main(String[] args) {

        String developerLastName = "Gordeev";
        Calendar getTask = Calendar.getInstance();
        Calendar submitTask = Calendar.getInstance();

        getTask.set(2023, 1 , 17, 15, 40,00);

        System.out.printf("Developer name: %s \n", developerLastName);
        System.out.printf("Task received: %s \n", getTask.getTime());
        System.out.printf("Task submitted: %s \n", submitTask.getTime());
    }
}