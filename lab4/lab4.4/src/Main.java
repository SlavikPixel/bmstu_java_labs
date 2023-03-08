// Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
// interface Врач <- class Хирург <- class Нейрохирург.
public class Main {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon(14);
        Neurosurgeon neurosurgeon = new Neurosurgeon(10);

        surgeon.treat();
        neurosurgeon.treat();
    }
}

interface Doctor {
    void treat();
}

class Surgeon implements Doctor {
    private int numberOfOperation;

    public Surgeon(int numberOfOperation) {
        this.numberOfOperation = numberOfOperation;
    }

    public int getNumberOfOperation() {
        return numberOfOperation;
    }

    public void setNumberOfOperation(int numberOfOperation) {
        this.numberOfOperation = numberOfOperation;
    }

    @Override
    public void treat() {
        System.out.println("Хирург лечит пациента");
    }
}

class Neurosurgeon extends Surgeon{
    public Neurosurgeon(int numberOfOperation) {
        super(numberOfOperation);
    }
    @Override
    public void treat() {
        System.out.println("Нейрохирург лечит пациента");
    }
}