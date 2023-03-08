public class Constructor {
    private String name;
    private String specialization;
    private int salary;

    public Constructor(String name, String specialization, int salary) {
        this.name = name;
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }
}
