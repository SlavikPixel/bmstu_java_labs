import java.util.ArrayList;

public class Client {
    private String name;
    private String number;
    private double balance;
    private boolean disabled;
    private ArrayList<Service> services;
    public Client(String name, String number, double balance, ArrayList<Service> services) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.disabled = false;
        this.services = services;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void addService(Service service) {
        services.add(service);
    }
    public void removeService(Service service) {
        services.remove(service);
    }
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
    public double payForServicesAndCall(double callCost) {
        double fullCost = 0;
        for (int i = 0; i < services.size(); i++) {
            fullCost += services.get(i).getPrice();
        }
        fullCost += callCost;
        balance -= fullCost;
        if (balance < 0) {
            setDisabled(true);
        }
        return fullCost;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public boolean isDisabled() {
        return disabled;
    }
    public ArrayList<Service> getServices() {
        return services;
    }
}
