import java.util.Scanner;
public class Exp3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float rad = input.nextFloat();
        System.out.println("Area will be: " + (3.1416 * rad * rad));
        System.out.println("Circumference will be: " + (2 * 3.1416 * rad));

    }
}
