import java.util.Scanner;
class t{
    String name;
    int id;
    t(String name, int id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
    }
}
public class Constructor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name and id: ");

        String name = input.nextLine();
        int id = input.nextInt();

        t s1 = new t(name,id);
        s1.display();
    }
}
