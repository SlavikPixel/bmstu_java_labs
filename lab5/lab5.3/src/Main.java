import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidApartmentDataException, BuildingExpiredException {
        House[] houses = new House[9];

        for (var i = 0; i < 9; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер квартиры: ");
            int apartmentNumber = scanner.nextInt();
            System.out.print("Введите площадь квартиры: ");
            double square = scanner.nextDouble();
            System.out.print("Введите этаж квартиры: ");
            int floor = scanner.nextInt();
            System.out.print("Введите количество комнат: ");
            int numberOfRooms = scanner.nextInt();

            if (square <= 0 || floor <= 0 || numberOfRooms <= 0) {
                throw new InvalidApartmentDataException("Ошибка ввода: некорректные данные о квартире.");
            }

            System.out.print("Введите улицу: ");
            String street = scanner.next();
            System.out.print("Введите тип постройки: ");
            String typeBuilding = scanner.next();
            System.out.print("Введите год эксплуатации: ");
            int yearsOfExploitation = scanner.nextInt();
            LocalDate now = LocalDate.now();
            int year = now.getYear();
            if (yearsOfExploitation < year) {
                throw new BuildingExpiredException("Год указан неверно");
            }

            houses[i] = new House(i, apartmentNumber, square, floor, numberOfRooms, street, typeBuilding, yearsOfExploitation);
        }

        City moscow = new City(houses);

        moscow.roomFilter(2);
        moscow.floorAndRoomFilter(3,3, 6);
        moscow.squareFilter(60);
    }

}