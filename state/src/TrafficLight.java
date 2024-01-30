public class TrafficLight {
    private State currentState;

    public TrafficLight(){
        this.currentState = new GreenState();
    }

    public void switchToGreen(){
        currentState = new GreenState();
        currentState.switchToGreen();
    }

    public void switchToRed(){
        currentState = new RedState();
        currentState.switchToRed();
    }

    public void switchToYellow(){
        currentState = new YellowState();
        currentState.switchToYellow();
    }
}
