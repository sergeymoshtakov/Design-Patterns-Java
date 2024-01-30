public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        MacroCommand macroCommand = new MacroCommand();

        macroCommand.addCommand(new LightOnCommand(light));
        macroCommand.addCommand(new LightOffCommand(light));
        macroCommand.addCommand(new LightOnCommand(light));

        RemoteControl remoteControl = new RemoteControl(macroCommand);

        remoteControl.pressButton();
    }
}