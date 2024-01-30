public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair produceChair() {
        return new ModernChair();
    }

    @Override
    public Sofa produceSofa() {
        return new ModernSofa();
    }

    @Override
    public Table produceTable() {
        return new ModernTable();
    }
}
