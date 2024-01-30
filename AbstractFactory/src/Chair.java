public abstract class Chair {
    private String name;
    public Chair(){
        setName("Chair");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void printInfo(){
        System.out.println("This is a " + this.getName());
    }
}
