import java.util.Scanner;
public class ArrayMath{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an array size");
        int n = input.nextInt();

        int[] num = new int[n];

        System.out.println("Enter n numbers");
        for(int i=0;i<n;i++){
            num[i]=input.nextInt();
        }
        int sum =0;
        int max = num[0];
        int min = num[0];

        for(int i=0;i<n;i++){
            sum+=num[i];

            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        double average = (double)sum/n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}