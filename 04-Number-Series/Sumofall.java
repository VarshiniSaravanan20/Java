import java.util.Scanner;
public class Sumofall {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Submeth(arr, size);
 }

    public static void Submeth(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
