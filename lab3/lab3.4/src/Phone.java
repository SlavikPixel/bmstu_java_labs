// Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль.

// Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Дебет, Кредит,
// Время городских и междугородных разговоров.
// Создать массив объектов. Вывести:
// a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
// b) сведения об абонентах, которые пользовались междугородной связью;
// c) сведения об абонентах в алфавитном порядке.
public class Phone {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private int numberCreditCard;
    private int debet;
    private int kredit;
    private int cityTalkTime;
    private int distanceTalkTime;

    public Phone(int id,
                 String firstName,
                 String lastName,
                 String patronymic,
                 String address,
                 int numberCreditCard,
                 int debet,
                 int kredit,
                 int cityTalkTime,
                 int distanceTalkTime) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCreditCard = numberCreditCard;
        this.debet = debet;
        this.kredit = kredit;
        this.cityTalkTime = cityTalkTime;
        this.distanceTalkTime = distanceTalkTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(int numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public int getCityTalkTime() {
        return cityTalkTime;
    }

    public void setCityTalkTime(int cityTalkTime) {
        this.cityTalkTime = cityTalkTime;
    }

    public int getDistanceTalkTime() {
        return distanceTalkTime;
    }

    public void setDistanceTalkTime(int distanceTalkTime) {
        this.distanceTalkTime = distanceTalkTime;
    }


    public String toString() {
        return "House: { " +
                "id: " + id + "; " +
                "firstname: " + firstName + "; " +
                "lastName: " + lastName + "; " +
                "patronymic: " + patronymic + "; " +
                "address: " + address + "; \n" +
                "numberCreditCard: " + numberCreditCard +
                "; debet: " + debet +
                "; kredit: " + kredit +
                "; cityTalkTime: " + cityTalkTime +
                "; distanceTalkTime: " + distanceTalkTime +
                "}";
    }
}
