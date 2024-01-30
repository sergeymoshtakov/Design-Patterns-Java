public class Employee extends Component{

    public Employee(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        System.out.println("Employee: " + this.getName());
    }
}
