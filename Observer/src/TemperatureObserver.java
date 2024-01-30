public class TemperatureObserver implements Observer{
    @Override
    public void update(int value) {
        System.out.println("The new temperature is: " + value);
    }
}
