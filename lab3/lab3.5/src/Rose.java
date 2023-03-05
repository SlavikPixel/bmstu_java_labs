import java.util.Objects;

// Создать приложение, удовлетворяющее требованиям, приведенным в задании.
// Аргументировать принадлежность классу каждого создаваемого метода и
// корректно переопределить для каждого класса методы equals(), hashCode(), toString().
// Создать объект класса Роза, используя классы Лепесток, Бутон.
// Методы: расцвести, завять, вывести на консоль цвет бутона.
public class Rose {
    private Bud bud;
    private Boolean isBloom = true;

    public Rose(Bud bud) {
        this.bud = bud;
    }
    public void blooming() {
        this.bud.blooming();
        this.isBloom = true;
        System.out.println("Роза расцвела!");
    }
    public void wilt() {
        this.bud.wilt();
        this.isBloom = false;
        System.out.println("Роза завяла");
    }
    public void getColor() {
        System.out.println("Цвет бутона: " + this.bud.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rose rose)) return false;
        return bud.equals(rose.bud) && isBloom.equals(rose.isBloom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bud, isBloom);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "bud=" + bud +
                ", isBloom=" + isBloom +
                '}';
    }
}

