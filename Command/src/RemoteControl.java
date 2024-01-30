public class RemoteControl { //Invoker
    LightOffCommand lightOff;
    LightOnCommand lightOn;
    MacroCommand macroCommand;
    public RemoteControl(LightOnCommand lightOn, LightOffCommand lightOff){
        this.lightOn = lightOn;
        this.lightOff = lightOff;
    }

    public RemoteControl(MacroCommand macroCommand) {
        this.macroCommand = macroCommand;
    }

    public void turnOnTheLight(){
        lightOn.execute();
    }
    public void turnOffTheLight(){
        lightOff.execute();
    }

    public void pressButton() {
        macroCommand.execute();
    }
}
