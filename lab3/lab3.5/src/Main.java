public class Main {
    public static void main(String[] args) {
        Petal petal1 = new Petal();
        Petal petal2 = new Petal();
        Petal petal3 = new Petal();
        Petal petal4 = new Petal();

        Petal[] petals = new Petal[4];
        petals[0] = petal1;
        petals[1] = petal2;
        petals[2] = petal3;
        petals[3] = petal4;

        Bud bud = new Bud(petals, "Красный");
        Rose rose = new Rose(bud);

        rose.getColor();
        rose.wilt();
        rose.blooming();
    }
}