
import java.util.Scanner;
public class Problem16 {
     public static void Automorphic(int n) {
        int temp = n;
        int square = n * n;
        while (temp > 0) {
            if (temp % 10 == square % 10) {
                System.out.println(" Automorphic");
                return;
            }

            temp = temp / 10;
            square = square / 10;
        }

        System.out.println("Not Automorphic");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Automorphic(n);
    }
   
}