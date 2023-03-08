public class TechnicalTask {
    private String customerName;
    private String projectName;
    private int numberOfFloors;
    private int projectCost;

    public TechnicalTask(String customerName, String projectName, int numberOfFloors) {
        this.customerName = customerName;
        this.projectName = projectName;
        this.numberOfFloors = numberOfFloors;
        this.projectCost = calculateProjectCost(numberOfFloors);
    }
    private int calculateProjectCost(int numberOfFloors) {
        return numberOfFloors * 10000;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getProjectCost() {
        return projectCost;
    }
}
