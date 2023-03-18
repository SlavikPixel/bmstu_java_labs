import java.util.Arrays;
import java.util.Comparator;

public class DatabasePhones {
    Phone[] phones;

    public DatabasePhones(Phone[] phones) {
        this.phones = phones;
    }

    public void sortUsers() { // Cведения об абонентах в алфавитном порядке
        System.out.println("Sorting users: ");
        Arrays.stream(this.phones).sorted(new PhoneComparator())
                .forEach(System.out::println);
        System.out.println();
    }
    public void usingDistanceTalkingFilter() { // сведения об абонентах, которые пользовались междугородной связью
        System.out.println("using distance talking filter. DistanceTalkTime > 0");
        Arrays.stream(this.phones)
                .filter(elem -> elem.getDistanceTalkTime() > 0)
                .forEach(System.out::println);
        System.out.println();
    }
    public void cityTalkFilter(int cityTime) { // сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
        System.out.println("city talk filter: cityTalkTime > " + cityTime);
        Arrays.stream(this.phones)
                .filter(elem -> elem.getCityTalkTime() > cityTime)
                .forEach(System.out::println);
        System.out.println();
    }
}

class PhoneComparator implements Comparator<Phone> {
    public int compare(Phone a, Phone b) {
        return a.getLastName().toUpperCase().compareTo(b.getLastName().toUpperCase());
    }
}