class St{
    private void display(){
        System.out.println("Hello private");;
    }
    void show(){
        display();
    }
}
public class PrivateMethod {
    public static void main(String[] args){
        St s1 = new St();
        s1.show();
    }
}
