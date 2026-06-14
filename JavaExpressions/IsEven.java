import java.util.Scanner;
public class IsEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 ==0;
        System.out.println("Is even: " + isEven);
    }
}
