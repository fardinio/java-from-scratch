class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Stn extends Person{
    int id;
    Stn(String name, int age, int id){
        super(name,age);
        this.id = id;
    }
    @Override
    void displayinfo(){
        super.displayinfo();
        System.out.println("Id: " + id);
    }
}
public class Inheritence {
    public static void main(String[] args){
        Stn s1 = new Stn("Fardin",22,224);
        s1.displayinfo();
    }
}
