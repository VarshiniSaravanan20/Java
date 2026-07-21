package practice_java;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 || num % 11 == 0) {
            System.out.println("The number is divisible by 5 or 11");
        } else {
            System.out.println("The number is not divisible by 5 or 11");
        }

        sc.close();
    }
}