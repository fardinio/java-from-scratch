import java.util.Scanner;
public class GpQueryList {
    public static void main(String[] args){
        System.out.println("""
                0. Download My Gp
                1. Balance, Call rate, FnF
                2. GP star
                3. Internet Pack
                4. Talk Time/ Minute pack
                5. My offers
                6. Welcome tune
                """);
        Scanner input = new Scanner(System.in);
        System.out.println("Select an option from 0 to 6: ");
        int number = input.nextInt();
        switch(number){
            case 0:
                System.out.println("Downloading MyGP.");
            break;
            case 1:
                System.out.println("You don't have sufficient balance, rechage now.");
            break;
            case 2:
                System.out.println("Your sounding privileged!");
            break;
            case 3:
                System.out.println("1 Gb at taka 38.");
            break;
            case 4:
                System.out.println("You have 100 minute free talk time.");
            break;
            case 5:
                System.out.println("You dont have any offer, migrate to another provider.");
            break;
            case 6:
                System.out.println("We are out of service at this moment.");
            break;
            default:
                System.out.println("You pressed wrong code");
        }
    }
}
