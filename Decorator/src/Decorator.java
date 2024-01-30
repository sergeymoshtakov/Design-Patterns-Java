public abstract class Decorator implements Coffee{
    protected Coffee decorator;
    public Decorator(Coffee decorator){
        this.decorator = decorator;
    }

    public String getDescription() {
        return decorator.getDescription();
    }

    public double getPrice() {
        return decorator.getPrice();
    }

    public Coffee getDecoratedCoffee() {
        return decorator;
    }
}
