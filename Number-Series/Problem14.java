
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = num * num;

        int temp = num;
        int digits = 1;

        while (temp >= 10) {
            digits++;
            temp /= 10;
        }

        int power = 1;
        for (int i = 1; i <= digits; i++) {
            power *= 10;
        }

        if (square % power == num) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }

        sc.close();
    }
}