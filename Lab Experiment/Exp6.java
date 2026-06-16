import java.util.Scanner;
public class Exp6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int count =1;

        for(int i=1;i<=n;i++){
            count*=i;
            System.out.print(i + "! = ");
            for(int j=1;j<=i;j++){
                if(j!=i){
                    System.out.print(j + " x ");
                }
                else{
                    System.out.println(j + " = " + count);
                }

            }
        }
    }
}
