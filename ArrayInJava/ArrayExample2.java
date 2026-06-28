public class ArrayExample2 {
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Index\tValue");
        for(int i=0;i<myArray.length;i++){
            System.out.println(i + "\t\t" + myArray[i]);
        }
    }
}
