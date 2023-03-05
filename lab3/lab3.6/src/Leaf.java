import java.util.Objects;

public class Leaf {
    private String color;
    private Boolean isFall = false;
    public Leaf(String color) {
        this.color = color;
    }

    protected void turnYellow() {
        this.color = "yellow";
        System.out.println("Лист пожелтел");
    }

    protected void fall() {
        this.isFall = true;
        System.out.println("Лист упал");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Leaf leaf)) return false;
        return color.equals(leaf.color) && isFall.equals(leaf.isFall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isFall);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                ", isFall=" + isFall +
                '}';
    }
}
