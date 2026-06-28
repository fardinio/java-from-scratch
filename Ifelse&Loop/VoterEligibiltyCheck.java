import java.util.Scanner;
public class VoterEligibiltyCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age< 18){
            System.out.println("Sorry! You are not eligible for vote.");
        }
        else{
            System.out.println("Congratulations! Your are eligible to vote.");
        }


    }
}
