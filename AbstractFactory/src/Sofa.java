public abstract class Sofa {
    private String name;
    public Sofa(){
        setName("Sofa");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void printInfo(){
        System.out.println("This is a " + this.getName());
    }}
