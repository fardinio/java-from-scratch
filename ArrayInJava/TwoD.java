import java.util.Scanner;
public class TwoD{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] num = new int[2][3];

        System.out.println("Enter 6 numbers: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                num[i][j]= input.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}