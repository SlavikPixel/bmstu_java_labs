// Создать класс Cправочная Cлужба Oбщественного Tранспорта с внутренним классом,
// с помощью объектов которого можно хранить информацию о времени, линиях маршрутов и стоимости проезда.
public class Main {
    public static void main(String[] args) {
        InformationServicePublicTransport depo = new InformationServicePublicTransport();

        depo.addTransportationInfo(10,0,"Kiev", "Moscow", 50);
        depo.addTransportationInfo(11,0,"Kiev", "Minsk", 70);
        depo.addTransportationInfo(10,0,"Moscow", "Bataysk", 100);
        depo.addTransportationInfo(11,0,"Moscow", "Minsk", 100);

        depo.searchTransportationInfoByRoute("Moscow","Bataysk");
        depo.searchTransportationInfoByTime(10,50);
    }
}