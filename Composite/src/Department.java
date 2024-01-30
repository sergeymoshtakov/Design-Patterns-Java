import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Department extends Component{
    private List<Component> components = new ArrayList<>();

    public Department(String name, List<Component> components) {
        super(name);
        setComponents(components);
    }

    public void setComponents(List<Component> components){
        List<Component> compCopy = new CopyOnWriteArrayList<>(components);
        this.components.addAll(compCopy);
    }

    public List<Component> getComponents(){
        return components;
    }

    @Override
    public void printInfo() {
        System.out.println("Department: " + this.getName());
        if(!components.isEmpty()){
            for(Component component : components){
                System.out.print("\t");
                component.printInfo();
            }
        }
    }
}
