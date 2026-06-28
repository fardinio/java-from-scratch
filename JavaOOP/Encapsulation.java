class Tutor{
    private String name;
    private int id;

    Tutor(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Tutor s = new Tutor("Fardin",2244);
        s.display();
        s.setName("Authai");
        System.out.println("Updated name: " + s.getName());
    }
}
