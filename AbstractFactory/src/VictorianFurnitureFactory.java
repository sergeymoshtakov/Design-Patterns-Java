public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair produceChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa produceSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table produceTable() {
        return new VictorianTable();
    }
}
