package practice_java;
import java.util.Scanner;

public class Averagearray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int size = sc.nextInt();

        int[] arr = new int[size];

        int sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double average = (double) sum / size;

        System.out.println(average);

      ;
    }
}
