public class Main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[9];

        phones[0] = new Phone(1, "Vyacheslav", "Gordeev", "Aleksanrovich", "Ramenskoe",
                123442, 123, 900, 12, 8);
        phones[1] = new Phone(1, "Jonathan", "Jablonowski", "Batkovich", "Ramenskoe",
                312423, 321, 344, 20, 0);
        phones[2] = new Phone(1, "Keith", "Markovic", "Batkovich", "Ramenskoe",
                423534, 423, 534, 19, 0);
        phones[3] = new Phone(1, "Russel", "Van Dulken", "Alekseevich", "Moscow",
                938494, 949, 932, 17, 0);
        phones[4] = new Phone(1, "Kirill", "Karasiow", "Yanovich", "Moscow",
                423949, 432, 926, 2, 15);
        phones[5] = new Phone(1, "Robin", "Kool", "Borisovich", "Bataysk",
                429394, 932, 238, 32, 0);
        phones[6] = new Phone(1, "Žygimantas", "Chmieliauskas", "Aleksanrovich", "Krasnodar",
                319024, 883, 493, 19, 8);
        phones[7] = new Phone(1, "Mike", "Grzesiek", "Alekseevich", "Kazan",
                942395, 612, 329, 11, 0);
        phones[8] = new Phone(1, "Marcelo", "David", "Alekseevich", "Moscow",
                150340, 322, 293, 12, 0);

        DatabasePhones dbPhones = new DatabasePhones(phones);

        dbPhones.sortUsers();
        dbPhones.cityTalkFilter(20);
        dbPhones.usingDistanceTalkingFilter();
    }
}