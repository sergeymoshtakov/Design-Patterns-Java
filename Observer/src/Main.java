public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        Observer observer = new TemperatureObserver();
        sensor.attach(observer);
        sensor.setTemperature(5);
        sensor.setTemperature(-19);
        sensor.detach(observer);
        sensor.setTemperature(0);
    }
}