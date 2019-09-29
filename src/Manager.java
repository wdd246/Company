public class Manager {
    private String name; //Can't be null so Optional is not required

    public Manager(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
