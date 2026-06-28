public class TwoDmath{
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int sum = 0;
        int min = arr[0][0];
        int max = arr[0][0];
        int count = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
                count++;

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        double average = (double) sum / count;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}