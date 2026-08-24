package practice_java;

import java.util.Scanner;

public class Problem4 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num % 2 == 0) {
	            System.out.println("Even Number");
	        } else {
	            System.out.println("Odd Number");
	        }

	        sc.close();
	 }
}
