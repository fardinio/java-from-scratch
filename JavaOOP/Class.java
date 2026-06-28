class Student{
    String name;
    int id;
    double cgpa;
    void display(){
        System.out.println("Name = " + name);
        System.out.println("Id = " + id);
        System.out.println("Cgpa = " + cgpa);
    }

}
public class Class {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Fardin";
        s1.id = 101;
        s1.cgpa = 4.00;

        s2.name = "Authai";
        s2.id = 102;
        s2.cgpa = 4.00;

        s1.display();
        s2.display();
    }
}
