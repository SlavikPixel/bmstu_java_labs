public class Fraction {
    private int m; // числитель
    private int n; // знаменатель
    public Fraction() {
        this.m = 0;
        this.n = 1;
    }
    public Fraction(int m, int n) {
        if (isParamNotValid(n) || isParamNotValid(m))
            throw new IllegalArgumentException("Значение, равное 0 - не допускается");
        this.m = m;
        this.n = n;
    }
    private boolean isParamNotValid(int p) {
        return p == 0;
    }
    public Fraction add(Fraction f) {
        int nm = m * f.n + n * f.m;
        int nn = n * f.n;
        return new Fraction(nm, nn);
    }
    public Fraction subtract(Fraction f) {
        int nm = m * f.n - n * f.m;
        int nn = n * f.n;
        return new Fraction(nm, nn);
    }
    public Fraction multiply(Fraction f) {
        int nm = m * f.m;
        int nn = n * f.n;
        return new Fraction(nm, nn);
    }
    public Fraction divide(Fraction f) {
        if (isParamNotValid(f.n) || isParamNotValid(f.m)) {
            throw new ArithmeticException("Знаменатель второй дроби = 0, деление не произведено");
        }
        int nm = m * f.n;
        int nn = n * f.m;
        return new Fraction(nm, nn);
    }
    public void print() {
        System.out.println(m + "/" + n);
    }
}