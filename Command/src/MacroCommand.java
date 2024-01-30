import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command{
    private List<Command> commandList = new ArrayList<>();
    public void addCommand(Command command){
        commandList.add(command);
    }
    @Override
    public void execute() {
        for(Command command : commandList){
            command.execute();
        }
    }
}
