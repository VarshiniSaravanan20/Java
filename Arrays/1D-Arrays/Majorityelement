import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Submeth(arr, size);
    }

    public static void Submeth(int arr[], int size) {

        for(int i = 0; i < size; i++) {

            int count = 0;

            for(int j = 0; j < size; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > size / 2) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println(-1);
    }
}
