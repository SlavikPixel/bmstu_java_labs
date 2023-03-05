import java.util.Arrays;
import java.util.Objects;

public class Bud {
    private Petal[] petal;
    private String color;
    private Boolean isBloom = true;

    public Bud(Petal[] petal, String color) {
        this.petal = petal;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void blooming() {
        this.isBloom = true;
        System.out.println("Бутон расцвел!");
    }
    public void wilt() {
        for (int i = 0; i < this.petal.length; i++) {
            this.petal[i].wilt();
        }
        this.isBloom = false;
        System.out.println("Бутон завял");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bud bud)) return false;
        return Arrays.equals(petal, bud.petal) && color.equals(bud.color) && isBloom.equals(bud.isBloom);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color, isBloom);
        result = 31 * result + Arrays.hashCode(petal);
        return result;
    }

    @Override
    public String toString() {
        return "Bud{" +
                "petal=" + Arrays.toString(petal) +
                ", color='" + color + '\'' +
                ", isBloom=" + isBloom +
                '}';
    }
}
