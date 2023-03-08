import java.util.ArrayList;

public class InformationServicePublicTransport {
    private ArrayList<TransportationInfo> transportations;

    public InformationServicePublicTransport() {
        transportations = new ArrayList<>();
    }

    public void addTransportationInfo(
            int timeHours,
            int timeMinutes,
            String routeLineFrom,
            String routeLineTo,
            double cost) {
        TransportationInfo info = new TransportationInfo(timeHours, timeMinutes, routeLineFrom, routeLineTo, cost);
        transportations.add(info);
    }

    public TransportationInfo searchTransportationInfoByTime(int timeHours, int timeMinutes) {
        for (TransportationInfo transportation : transportations) {
            if (transportation.getTimeHours() > timeHours) {
                System.out.println("Информация по заданному времени: \n" + transportation.toString());
                return transportation;
            } else if (transportation.getTimeMinutes() >= timeMinutes && transportation.getTimeHours() == timeHours) {
                System.out.println("Информация по заданному времени: \n" + transportation.toString());
                return transportation;
            }
        }
        return null;
    }

    public TransportationInfo searchTransportationInfoByRoute(String routeLineFrom, String routeLineTo) {
        for (TransportationInfo transportation : transportations) {
            if ((transportation.getRouteLineFrom().equals(routeLineFrom)) && (transportation.getRouteLineTo().equals(routeLineTo))) {
                System.out.println("Информация по заданному маршруту: \n" + transportation.toString());
                return  transportation;
            }
        }
        return null;
    }

    private class TransportationInfo {
        private int timeHours;
        private int timeMinutes;

        private String routeLineFrom;
        private String routeLineTo;
        private double cost;

        public TransportationInfo(
                int timeHours,
                int timeMinutes,
                String routeLineFrom,
                String routeLineTo,
                double cost) {
            this.timeHours = timeHours;
            this.timeMinutes = timeMinutes;
            this.routeLineFrom = routeLineFrom;
            this.routeLineTo = routeLineTo;
            this.cost = cost;
        }

        public int getTimeHours() {
            return timeHours;
        }

        public int getTimeMinutes() {
            return timeMinutes;
        }

        public String getRouteLineFrom() {
            return routeLineFrom;
        }

        public String getRouteLineTo() {
            return routeLineTo;
        }

        public String getTime() {
            return timeHours + ":" + timeMinutes;
        }

        public String getRouteLine() {
            return routeLineFrom + "-" + routeLineTo;
        }

        public double getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return "Информация о маршруте: " + "\n" +
                    "Время отъезда: " + timeHours + ":" + timeMinutes + "\n" +
                    "Откуда: " + routeLineFrom + '\n' +
                    "Куда: " + routeLineTo + '\n' +
                    "Стоимость: " + cost + '\n';
        }
    }
}
