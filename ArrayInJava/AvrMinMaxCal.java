import java.util.Scanner;
public class AvrMinMaxCal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int len = input.nextInt();
        int[] numbers = new int[len];

        for(int i=0;i<len;i++){
            numbers[i] = input.nextInt();
        }
        int sum = 0;

        for(int i=0;i<len;i++){
            sum+=numbers[i];
        }
        double average = sum/(double)len;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<len;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }
}
