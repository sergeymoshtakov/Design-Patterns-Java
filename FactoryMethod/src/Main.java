public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ChairFactory();
        Furniture chair = furnitureFactory.createFurniture();
        Furniture table = (new TableFactory()).createFurniture();
        Furniture cabinet = (new CabinetFactory()).createFurniture();
        chair.assemble();
        table.assemble();
        cabinet.assemble();
    }
}