import java.util.Scanner;
public class VowelConstant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        str = str.toLowerCase();

        int vowels = 0;
        int constant = 0;

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>= 'a' && ch<= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                    vowels++;
                }
                else{
                    constant++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Constants = " + constant);
    }
}