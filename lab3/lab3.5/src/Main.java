public class Main {
    public static void main(String[] args) {
        Bud bud = new Bud("Фиолетовый");

        Petal petalGreen = new Petal("Зеленый");
        Petal petalWhite = new Petal("Белый");
        Petal petalBlack = new Petal("Черный");

        Petal[] petalPack = new Petal[4];
        petalPack[0] = petalGreen;
        petalPack[1] = petalBlack;
        petalPack[2] = petalWhite;
        petalPack[3] = petalGreen;

        Rose rose = new Rose(petalPack, bud);

        System.out.println("BUD methods: ");
        System.out.println(bud.getColor());
        System.out.println(bud.equals(bud));
        System.out.println(bud.hashCode());
        System.out.println(bud.toString());

        System.out.println();
        System.out.println("PETAL methods: ");
        System.out.println(petalWhite.getColor());
        System.out.println(petalWhite.equals(petalBlack));
        System.out.println(petalWhite.hashCode());
        System.out.println(petalBlack.hashCode());
        System.out.println(petalWhite.toString());

        System.out.println();
        System.out.println("ROSE methods: ");
        rose.blooming();
        rose.wilt();
        rose.getBudColor();
        System.out.println(rose.equals(rose));
        System.out.println(rose.hashCode());
        System.out.println(rose.toString());
    }
}