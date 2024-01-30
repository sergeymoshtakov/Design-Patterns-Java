public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Description: " + coffee.getDescription() + ", Cost: " + coffee.getPrice());

        coffee = new MilkDecorator(coffee);
        System.out.println("Description: " + coffee.getDescription() + ", Cost: " + coffee.getPrice());

        coffee = new SugarDecorator(coffee);
        System.out.println("Description: " + coffee.getDescription() + ", Cost: " + coffee.getPrice());

        coffee = ((Decorator) coffee).getDecoratedCoffee(); // Получаем базовый компонент
        System.out.println("Coffee without sugar: " + coffee.getDescription());

        coffee = ((Decorator) coffee).getDecoratedCoffee(); // Получаем базовый компонент
        System.out.println("Coffee without milk: " + coffee.getDescription());
    }
}