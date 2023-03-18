public class ChainFraction {
    public int n;
    public int x;
    public double[] a;
    public ChainFraction(int x, int n, double[] a) {
        if (isArrayNotValid(a[n-1]))
            throw new IllegalArgumentException("Вводимые параметры недопустимы для цепной дроби");
        this.x = x;
        this.n = n;
        this.a = a;
    }
    private boolean isArrayNotValid(double p) {
        return p == 0;
    }
    public double getValue() {
        double value = a[n-1];
        for (int i = n - 2; i >= 0; i--) {
            value = a[i] + x / value;
        }
        return value;
    }
    public double add(ChainFraction f) {
        double fValue1 = this.getValue();
        double fValue2 = f.getValue();
        return fValue1 + fValue2;
    }
    public double subtract(ChainFraction f) {
        double fValue1 = this.getValue();
        double fValue2 = f.getValue();
        return fValue1 - fValue2;
    }
    public double multiply(ChainFraction f) {
        double fValue1 = this.getValue();
        double fValue2 = f.getValue();
        return fValue1 * fValue2;
    }
    public double divide(ChainFraction f) {
        double fValue1 = this.getValue();
        double fValue2 = f.getValue();
            if (fValue2 == 0) throw new ArithmeticException("Деление на 0 невозможно");
        return fValue1 / fValue2;
    }
}
