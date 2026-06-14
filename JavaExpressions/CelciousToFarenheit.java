import java.util.Scanner;

public class CelciousToFarenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in celcious: ");
        int cel = input.nextInt();
        double farenheit = (cel * 9/5)+32;
        System.out.println("Temperature in farenheit: " + farenheit);
    }
}
