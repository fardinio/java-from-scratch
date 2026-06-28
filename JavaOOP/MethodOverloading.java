class Cal {

    void welcome() {
        System.out.println("Welcome to Calculator");
    }

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {

        Cal m = new Cal();

        m.welcome();

        m.add(10, 20);

        int result1 = m.multiply(5, 4);
        System.out.println("Multiplication = " + result1);

        int result2 = m.multiply(2, 3, 4);
        System.out.println("Overloaded Multiplication = " + result2);
    }
}