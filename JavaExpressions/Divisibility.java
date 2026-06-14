import java.util.Scanner;
public class Divisibility {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

       boolean a = number % 2 ==0;
       boolean b = number % 5 ==0;
       boolean c = a && b;

       System.out.println(c);
   }
}
