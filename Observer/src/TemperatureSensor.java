public class TemperatureSensor extends Subject{
    int temp;

    public void setTemperature(int temp){
        this.temp = temp;
        notifyObservers(temp);
    }

    public int getTemperature(){
        return temp;
    }
}
