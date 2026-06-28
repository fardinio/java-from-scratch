interface A{
    void showA();
}
interface B{
    void showB();
}
class X implements A,B{
    public void showA(){
        System.out.println("This is A");
    }
    public void showB(){
        System.out.println("This is B");
    }
}
public class Interface {
    public static void main(String[] args){
        X s = new X();
        s.showA();
        s.showB();
    }
}
