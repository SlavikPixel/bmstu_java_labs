import java.util.Arrays;
import java.util.Objects;

// Создать приложение, удовлетворяющее требованиям, приведенным в задании.
// Аргументировать принадлежность классу каждого создаваемого метода и
// корректно переопределить для каждого класса методы equals(), hashCode(), toString().
// Создать объект класса Роза, используя классы Лепесток, Бутон.
// Методы: расцвести, завять, вывести на консоль цвет бутона.
public class Rose {
    private Petal[] petal;
    private Bud bud;
    public Rose(Petal[] petal, Bud bud) {
        this.petal = petal;
        this.bud = bud;
    }
    public void blooming() {
        System.out.println("Роза расцвела!");
    }
    public void wilt() {
        System.out.println("Роза завяла");
    }
    public void getBudColor() {
        System.out.println("Цвет бутона: " + bud.getColor());
    }

    public Petal[] getPetal() {
        return petal;
    }

    public void setPetal(Petal[] petal) {
        this.petal = petal;
    }

    public Bud getBud() {
        return bud;
    }
    public void setBud(Bud bud) {
        this.bud = bud;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return Objects.equals(petal, rose.petal) &&
                Objects.equals(bud, rose.bud);
    }
    @Override
    public int hashCode() {
        return Objects.hash(petal, bud);
    }
    @Override
    public String toString() {
        String petalsList = "";
        for (int i = 0; i < this.petal.length; i++) {
            petalsList += (this.petal[i].getColor() + ", ");
        }
        return "Rose: {" +
                "petals: " + petalsList +
                "bud: " + this.bud +
                " }";
    }
}
