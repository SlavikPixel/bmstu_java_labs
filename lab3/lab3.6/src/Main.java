// Создать приложение, удовлетворяющее требованиям, приведенным в задании.
// Аргументировать принадлежность классу каждого создаваемого метода и
// корректно переопределить для каждого класса методы equals(), hashCode(), toString().

// Создать объект класса Дерево, используя классы Лист.
// Методы: зацвести, опасть листьям, покрыться инеем, пожелтеть листьям.
public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Зеленый");
        Leaf leaf2 = new Leaf("Зеленый");
        Leaf leaf3 = new Leaf("Красный");
        Leaf leaf4 = new Leaf("Желтый");
        Leaf leaf5 = new Leaf("Красный");
        Leaf leaf6 = new Leaf("Коричневый");

        Leaf[] leaves = new Leaf[6];
        leaves[0] = leaf1;
        leaves[1] = leaf2;
        leaves[2] = leaf3;
        leaves[3] = leaf4;
        leaves[4] = leaf5;
        leaves[5] = leaf6;

        Tree tree = new Tree(leaves);

        tree.bloom();
        tree.frostOver();
        tree.turnYellow();
        tree.fall();

        System.out.println(tree.toString());
    }
}