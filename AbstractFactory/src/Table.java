public abstract class Table {
    private String name;
    public Table(){
        setName("Table");
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
