import java.util.Arrays;
public class City {
    House[]  houses;
    public City(House[] houses) {
        this.houses = houses;
    }

    public void roomFilter(int numberOfRooms) { //Квартиры, имеющие заданное число комнат
        System.out.println("numberOfRooms filter: NumberOfRooms = " + numberOfRooms);
        Arrays.stream(this.houses)
                .filter(elem -> elem.getNumberOfRooms() == numberOfRooms)
                .forEach(System.out::println);
        System.out.println();
    }
    public void floorAndRoomFilter(int numberOfRooms, int minFloor, int maxFloor) { // Расположенных на этаже, который находится в заданном промежутке
        System.out.println("floorRoom filter. Room: " + numberOfRooms + ";  " + minFloor + "<= FLOOR <=" + maxFloor);
        Arrays.stream(this.houses)
                .filter(elem -> elem.getFloor() >= minFloor && elem.getFloor() <= maxFloor)
                .filter(elem -> elem.getNumberOfRooms() == numberOfRooms)
                .forEach(System.out::println);
        System.out.println();
    }
    public void squareFilter(int square) { // список квартир, имеющих площадь, превосходящую заданную
        System.out.println("square filter: SQUARE >= " + square);
        Arrays.stream(this.houses)
                .filter(elem -> elem.getSquare() >= square)
                .forEach(System.out::println);
        System.out.println();
    }
}