public abstract class Component {
    private String name;

    public Component(String name){
        setName(name);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void printInfo();
}
