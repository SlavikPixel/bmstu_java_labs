import java.util.Objects;

public class Bud {
    private String color;
    public Bud(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return Objects.equals(color, bud.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
    @Override
    public String toString() {
        return "Bud: { color: " + this.color + "}";
    }
}
