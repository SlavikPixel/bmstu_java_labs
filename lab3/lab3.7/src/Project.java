import java.util.ArrayList;

public class Project {
    private TechnicalTask technicalTask;
    private int projectCost;
    private ConstructionTeam constructionTeam;

    public Project(TechnicalTask technicalTask, ConstructionTeam constructionTeam) {
        this.technicalTask = technicalTask;
        this.projectCost = technicalTask.getProjectCost();
        this.constructionTeam = constructionTeam;
    }

    public void addConstructorToTeam(Constructor constructor) {
        constructionTeam.addConstructor(constructor);
    }

    public void removeConstructorFromTeam(Constructor constructor) {
        constructionTeam.removeConstructor(constructor);
    }

    public int getProjectCost() {
        return projectCost;
    }
    public ConstructionTeam getConstructionCompany() {
        return constructionTeam;
    }

    public int getFullPriceOfProject() {
        int fullPrice = getProjectCost() + constructionTeam.getFullSalaryTeam();
        return fullPrice;
    }
}
