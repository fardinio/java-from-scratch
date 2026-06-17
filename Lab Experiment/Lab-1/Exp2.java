import java.util.Scanner;
public class Exp2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance covered by bus in KM: ");
        float dis = input.nextFloat();
        System.out.print("Enter the time taken by bus in HOURS: ");
        float time = input.nextFloat();

        float speed = (dis * 1000)/(time * 3600);
        System.out.println("Speed will be: " + speed + "m/s");
    }
}
