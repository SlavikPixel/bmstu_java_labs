import java.util.Objects;

public class Petal {
    private Boolean isBloom = true;
    public void wilt() {
        this.isBloom = false;
        System.out.println("Лепесток завял");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Petal petal)) return false;
        return Objects.equals(isBloom, petal.isBloom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBloom);
    }

    @Override
    public String toString() {
        return "Petal{" +
                "isBloom=" + isBloom +
                '}';
    }
}
