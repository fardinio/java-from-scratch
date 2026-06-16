import java.util.Scanner;

public class Exp5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i=a; i<=b; i++){
            if(i%3==0 && i%5 ==0){
                continue;
            }
            else if(i%3 ==0 || i%5 ==0){
                System.out.println(i);
            }
        }
    }
}
