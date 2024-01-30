public class MilkDecorator extends Decorator{
    public MilkDecorator(Coffee decorator) {
        super(decorator);
    }
    public String getDescription() {
        return decorator.getDescription() + ", Milk";
    }

    public double getPrice() {
        return decorator.getPrice() + 0.5;
    }
}
