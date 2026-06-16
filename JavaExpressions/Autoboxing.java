public class Autoboxing {
    public Integer add(Integer a, Integer b){

        return a+b;
    }
    public static void main(String[] args){
        Autoboxing example = new Autoboxing();
        int a = 10;
        int b = 20;
        int sum = example.add(a,b);
        System.out.println("Sum : " + sum);
    }
}
