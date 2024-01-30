public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.produceChair();
        factory = new VictorianFurnitureFactory();
        Table table = factory.produceTable();
        chair.printInfo();
        table.printInfo();
    }
}