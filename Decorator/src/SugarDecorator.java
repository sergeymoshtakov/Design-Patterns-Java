public class SugarDecorator extends Decorator{
    public SugarDecorator(Coffee decorator) {
        super(decorator);
    }

    public String getDescription() {
        return decorator.getDescription() + ", Sugar";
    }

    public double getPrice() {
        return decorator.getPrice() + 0.2;
    }
}
