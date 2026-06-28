class Sd{
    String name;
    int id;

    Sd(){
        System.out.println("Default Constructor");
    }
    Sd(String name){
        this.name=name;
        System.out.println("Name: " + name);
    }
    Sd(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

}
public class ConstructorOverloading {
    public static void main(String[] args){
        Sd s1 = new Sd();
        Sd s2 = new Sd("Fardin");
        Sd s3 = new Sd("Fardin", 224);
    }
}
