import java.util.Arrays;
import java.util.Objects;

public class Tree {
    private Leaf[] leaves;
    private Boolean isBloom = false;
    private Boolean isFrost = false;
    public Tree(Leaf[] leaves) {
        this.leaves = leaves;
    }
    public void bloom() {
        this.isBloom = true;
        System.out.println("Дерево зацвело");
    }
    public void frostOver() {
        this.isFrost = true;
        System.out.println("Дерево покрылось инеем");
    }

    public void fall() {
        for (int i = 0; i < this.leaves.length; i++) {
            this.leaves[i].fall();
        }
        System.out.println("Все листья упали");
        System.out.println();
    }

    public void turnYellow() {
        for (int i = 0; i < this.leaves.length; i++) {
            this.leaves[i].turnYellow();
        }
        System.out.println("Все листья пожелтели");
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree tree)) return false;
        return Arrays.equals(leaves, tree.leaves) && isBloom.equals(tree.isBloom) && isFrost.equals(tree.isFrost);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isBloom, isFrost);
        result = 31 * result + Arrays.hashCode(leaves);
        return result;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leaves=" + Arrays.toString(leaves) +
                ", isBloom=" + isBloom +
                ", isFrost=" + isFrost +
                '}';
    }
}
