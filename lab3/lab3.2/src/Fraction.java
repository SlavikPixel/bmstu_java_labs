public class Fraction {
    private int m; // числитель
    private int n; // знаменатель
    public Fraction() {  //Конструктор при числителе 0
        m = 0;
        n = 1;
    }
    public Fraction(int m) {  // Конструктор при знаменателе 0
        this.m = m;
        this.n = 1;
    }
    public Fraction(int m, int n) {  //Конструктор обыкновенной дроби
        this.m = m;
        this.n = n;
    }
    public Fraction add(Fraction f) {       // Метод сложения дробей
        int nm = m * f.n + n * f.m;
        int nn = n * f.n;
        return new Fraction(nm, nn);
    }
    public Fraction subtract(Fraction f) {  // Метод вычитания дробей
        int nm = m * f.n - n * f.m;
        int nn = n * f.n;
        return new Fraction(nm, nn);
    }
    public Fraction multiply(Fraction f) {  // Метод умножения дробей
        int nm = m * f.m;
        int nn = n * f.n;
        return new Fraction(nm, nn);
    }
    public Fraction divide(Fraction f) {    // Метод деления дробей
        int nm = m * f.n;
        int nn = n * f.m;
        return new Fraction(nm, nn);
    }
    public void print() {                   // Метод вывода
        System.out.println(m + "/" + n);
    }
}
