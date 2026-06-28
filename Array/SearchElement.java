import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Enter a number to search: ");
        int key = input.nextInt();

        boolean found = false;

        for(int i =0;i<num.length;i++){
            if(num[i]==key){
                found=true;
                System.out.println("Fount at index: " + i);
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
