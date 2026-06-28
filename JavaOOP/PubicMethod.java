class Std {

    public void display() {
        System.out.println("Public Method");
    }

}

public class PubicMethod {
    public static void main(String[] args) {

        Std s = new Std();

        s.display();
    }
}