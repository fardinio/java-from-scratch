class person{
    String name;

    person(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name: " + name);
    }
}
class Stdnt extends person{
    int id;
    Stdnt(String name, int id){
        super(name);
        this.id = id;
    }
    @Override
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}
public class InheritenceMethodoveriding {
    public static void main(String[] args){
        Stdnt s = new Stdnt("Fardin", 224);
        s.display();
    }
}
