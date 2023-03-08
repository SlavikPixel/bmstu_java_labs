// Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
// interface Корабль <- abstract class Военный Корабль <- class Авианосец.
public class Main {
    public static void main(String[] args) {
        AircraftCarrier aircraft = new AircraftCarrier( 30,  5);

        aircraft.sail();
        aircraft.attack();
    }
}

interface Ship {
    void sail();
}

abstract class WarShip implements Ship {
    private int speed;
    public WarShip(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    abstract void attack();

    @Override
    public void sail() {
        System.out.println("Военный корабль поплыл!");
    }
}

class AircraftCarrier extends WarShip{
    private int numberOfPlanes;
    public AircraftCarrier(int speed, int numberOfPlanes) {
        super(speed);
        this.numberOfPlanes = numberOfPlanes;
    }
    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }
    public void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }
    @Override
    public void sail() {
        System.out.println("Авианосец поплыл!");
    }
    @Override
    public void attack() {
        System.out.println("Самолеты полетели!");
    }
}


