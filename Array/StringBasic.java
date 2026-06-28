public class StringBasic {
    public static void main(String[] args){
        String name = "Fardin Rahman";
        System.out.println("Strig = " + name);
        System.out.println("String Length = " + name.length());
        System.out.println("Uppercase = " + name.toUpperCase());
        System.out.println("Lowercase = " + name.toLowerCase());
        System.out.println("Character at index 0 = " + name.charAt(0));
        System.out.println("Substring = " + name.substring(0,6));
        System.out.println("Contains Rahman? " + name.contains("Rahman"));
    }
}
