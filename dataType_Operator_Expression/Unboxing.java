public class Unboxing {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Unboxing example = new Unboxing();
        Integer a = 10;
        Integer b = 20;
        Integer sum = example.add(a,b);
        System.out.println("Sum : " + sum);
    }
}
