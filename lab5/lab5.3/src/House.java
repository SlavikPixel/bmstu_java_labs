// Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль.

import java.time.LocalDate;

//House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации.
// Создать массив объектов.
// Вывести:
// a) список квартир, имеющих заданное число комнат;
// b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке;
// c) список квартир, имеющих площадь, превосходящую заданную.
public class House {
    private int id;
    private int number;
    private double square;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String typeBuilding;
    private int yearsOfExploitation;
    public House(int id,
                 int number,
                 double square,
                 int floor,
                 int numberOfRooms,
                 String street,
                 String typeBuilding,
                 int yearsOfExploitation) {
        this.id = id;
        this.number = number;
        this.square = square;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.typeBuilding = typeBuilding;
        this.yearsOfExploitation = yearsOfExploitation;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) throws InvalidApartmentDataException {
        if (number < 0) throw new InvalidApartmentDataException("Ошибка при изменении номера дома");
        this.number = number;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) throws InvalidApartmentDataException {
        if (square < 0) throw new InvalidApartmentDataException("Ошибка при изменении площади");
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) throws InvalidApartmentDataException {
        if (floor < 0) throw new InvalidApartmentDataException("Ошибка при изменении этажей дома");
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) throws InvalidApartmentDataException {
        if (numberOfRooms < 0) throw new InvalidApartmentDataException("Ошибка при изменении комнат дома");
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeBuilding() {
        return typeBuilding;
    }

    public void setTypeBuilding(String typeBuilding) {
        this.typeBuilding = typeBuilding;
    }

    public int getYearsOfExploitation() {
        return yearsOfExploitation;
    }

    public void setYearsOfExploitation(int yearsOfExploitation) throws BuildingExpiredException {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        if (yearsOfExploitation < year) throw new BuildingExpiredException("Год указан неверно");
        this.yearsOfExploitation = yearsOfExploitation;
    }

    public String toString() {
        return "House: { " +
                "id: " + id + "; " +
                "number: " + number + "; " +
                "square: " + square + "; " +
                "floor: " + floor + "; " +
                "numberOfRooms: " + numberOfRooms + "; \n" +
                "street: " + street +
                "; type: " + typeBuilding +
                "; yearsOfExploitation: " + yearsOfExploitation +
                "}";
    }
}
