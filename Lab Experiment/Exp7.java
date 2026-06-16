import java.util.Scanner;
public class Exp7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for(int i=1; i<=(n/2); i++){
            System.out.print(i + " " + (n-i+1) + " ");
        }
        System.out.println();
    }
}

