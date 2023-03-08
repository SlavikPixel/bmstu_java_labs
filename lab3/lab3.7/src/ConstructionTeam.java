import java.util.ArrayList;

public class ConstructionTeam {
    private ArrayList<Constructor> constructors;

    public ConstructionTeam() {
        this.constructors = new ArrayList<>();
    }

    public void addConstructor(Constructor constructor) {
        constructors.add(constructor);
    }

    public void removeConstructor(Constructor constructor) {
        constructors.remove(constructor);
    }

    public ArrayList<Constructor> getConstructors() {
        return constructors;
    }

    public int getConstructorCount() {
        return constructors.size();
    }

    public int getFullSalaryTeam() {
        int fullSalary = 0;
        for (int i = 0; i < getConstructorCount(); i++) {
            fullSalary += constructors.get(i).getSalary();
        }
        return fullSalary;
    }
}
