package practice_java;
import java.util.Scanner;
public class Problem18 {
    public static void Num(int a) {
          while (a > 0) {
            int rem = a % 10;
            int count = 0;
          for (int i = 1; i <= rem; i++) {
                if (rem % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(rem);
            }

            a = a / 10;
        }
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           Num(a);

        
    }
}