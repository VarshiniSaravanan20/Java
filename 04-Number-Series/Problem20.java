package practice_java;

import java.util.Scanner;

public class Problem20 {

    public static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (isPrime(original) && isPrime(reverse))
            System.out.println("Twisted Prime");
        else
            System.out.println("Not a Twisted Prime");

        sc.close();
    }
}