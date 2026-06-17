import java.util.Scanner;
public class Exp1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Summation: " + (a+b));
        System.out.println("Substraction: "+ (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + ( a/b));
    }
}