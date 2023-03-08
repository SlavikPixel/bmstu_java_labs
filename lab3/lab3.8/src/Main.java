// Построить модель программной системы.
// Система Телефонная станция.
// Абонент оплачивает Счет за разговоры и Услуги, может попросить
// Администратора сменить номер и отказаться от услуг.
// Администратор изменяет номер, Услуги и временно отключает Абонента за неуплату.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Service internet = new Service("Интернет", 1000);
        Service tv = new Service("Телевидение", 500);
        Service phone = new Service("Телефон", 300);

        ArrayList<Service> client1Services = new ArrayList<>();
        client1Services.add(internet);
        client1Services.add(tv);
        Client client1 = new Client(
                "Гордеев Вячеслав",
                "79988129",
                5000,
                client1Services);

        ArrayList<Service> client2Services = new ArrayList<>();
        client2Services.add(phone);
        Client client2 = new Client(
                "Эрен Йегер",
                "8888990",
                1000,
                client2Services);

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        ArrayList<Service> services = new ArrayList<>();
        services.add(internet);
        services.add(tv);
        services.add(phone);

        TelephoneStation telephoneStation = new TelephoneStation(clients, services, 2.5);

        telephoneStation.changeNumberForClient(client1, "654321");

        telephoneStation.removeServiceFromClient(client1, tv);

        telephoneStation.banClient(client2);

        telephoneStation.addServiceToClient(client1, phone);

        double servicesAndCallCost = telephoneStation.payClientForServicesAndCall(client1, 20);

        System.out.println("Стоимость услуг и звонков для " + client1.getName() + ": " + servicesAndCallCost);
    }
}