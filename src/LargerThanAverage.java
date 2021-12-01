import java.util.Scanner;

public class LargerThanAverage {
    public static void numbers(int num[]) {
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = num[i] + sum;
        }
        double average = sum / num.length;
        for (int j = 0; j < num.length; j++) {
            if (average < num[j]) {
                System.out.print("," + num[j] + ",");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Ten numbers must be typed");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println("The numbers above average are");
        numbers(array);
    }
}
