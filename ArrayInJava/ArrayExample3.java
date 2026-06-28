import java.util.Scanner;
public class ArrayExample3 {
    public static void main(String[] args){
        System.out.println("length of array:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] myArray = new int[length];
        for(int i=0;i<length;i++){
            System.out.print("index " + i + ": ");
            myArray[i] = input.nextInt();
        }
        System.out.println("Index\tValue");
        for(int i=0;i<length;i++){
            System.out.println(i + "\t" + myArray[i]);
        }
    }
}
