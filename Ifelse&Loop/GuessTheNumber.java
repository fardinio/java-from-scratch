import java.util.Scanner;
public class GuessTheNumber {
   public static void main(String[] args){
       int number = 15;

       Scanner input = new Scanner(System.in);
       System.out.println("Guess The Number: ");

       int guess = input.nextInt();

       if(guess == number){
           System.out.println("Congratulations! Your guessed number is corrected!");
       }
       else if(number>guess){
             System.out.println("The number is greater than " + guess);
       }
       else{
           System.out.println("The number is smaller than " + guess);
       }
   }
}
