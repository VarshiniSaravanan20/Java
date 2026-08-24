package practice_java;
import java.util.Scanner;

public class Problem19{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        
        int count = 0;
        int temp = num;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;

        
        while (temp > 0) {
            int rem = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * rem;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is Not an Armstrong Number");
        }

        sc.close();
    }
}