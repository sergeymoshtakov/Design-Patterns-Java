public class CabinetFactory extends FurnitureFactory{
    @Override
    public Furniture createFurniture(){
        return new Cabinet();
    }
}