public class Main {
    public static void main(String[] args) {
        House[] houses = new House[9];

        houses[0] = new House(1, 22, 30, 5, 3, "Gurieva", "dom", 12);
        houses[1] = new House(2, 23, 50, 1, 5, "Krasnoarmeyskaya", "sky", 8);
        houses[2] = new House(3, 24, 40, 8, 2, "Popova", "boat", 6);
        houses[3] = new House(4, 24, 40, 10, 1, "Dergaevskaya", "sky", 6);
        houses[4] = new House(5, 12, 60, 2, 5, "Gurieva", "sky", 2);
        houses[5] = new House(6, 20, 65, 3, 2, "Gurieva", "dom", 6);
        houses[6] = new House(7, 22, 10, 3, 2, "Popova", "boat", 2);
        houses[7] = new House(8, 22, 20, 5, 1, "Dergaevskaya", "dom", 3);
        houses[8] = new House(9, 12, 40, 1, 3, "Dergaevskaya", "dom", 10);

        City moscow = new City(houses);

        moscow.roomFilter(2);
        moscow.floorAndRoomFilter(3,3, 6);
        moscow.squareFilter(60);
    }

}