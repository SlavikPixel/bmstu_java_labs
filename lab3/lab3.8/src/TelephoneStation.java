import java.util.ArrayList;

public class TelephoneStation {
    private ArrayList<Client> clients;
    private ArrayList<Service> services;
    private double costPerMinute;
    public TelephoneStation(ArrayList<Client> subscribers, ArrayList<Service> services, double callRate) {
        this.clients = subscribers;
        this.services = services;
        this.costPerMinute = callRate;
    }
    public void changeNumberForClient(Client client, String newNumber) {
        if (clients.contains(client)) {
            client.setNumber(newNumber);
        } else {
            System.out.println("Система не поддерживает клиента");
        }
    }
    public void addServiceToClient(Client client, Service service) {
        if (clients.contains(client) && services.contains(service)) {
            client.addService(service);
        } else {
            System.out.println("Система не поддерживает клиента или услугу");
        }
    }
    public void removeServiceFromClient(Client client, Service service) {
        if (clients.contains(client) && services.contains(service)) {
            client.removeService(service);
        } else {
            System.out.println("Система не поддерживает клиента или услугу");
        }
    }
    public void banClient(Client client) {
        if (clients.contains(client)) {
            client.setDisabled(true);
        } else {
            System.out.println("Система не поддерживает клиента");
        }
    }
    public void unbanClient(Client client) {
        if (clients.contains(client)) {
            client.setDisabled(false);
        } else {
            System.out.println("Система не поддерживает клиента");
        }
    }
    public double calculateCallCost(double duration) {
        return duration * costPerMinute;
    }
    public double payClientForServicesAndCall(Client client, double duration) {
        if (clients.contains(client)) {
            double callCost = calculateCallCost(duration);
            return client.payForServicesAndCall(callCost);
        } else {
            System.out.println("Система не поддерживает клиента");
            return 0;
        }
    }
}
