import java.util.Scanner;
public class Automorphic {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        Automorphic1(n);
	    }

	    public static void Automorphic1(int n) {

	        int temp = n;
	        int digit = 0;

	        // Count digits
	        while(temp > 0) {
	            digit++;
	            temp = temp / 10;
	        }

	        // Find square
	        int square = n * n;

	        // Find 10^digit
	        int power = 1;

	        for(int i = 0; i < digit; i++) {
	            power = power * 10;
	        }

	        // Get last digits
	        int rem = square % power;

	        if(rem == n) {
	            System.out.print("Automorphic");
	        }
	        else {
	            System.out.print("Not Automorphic");
	        }
	    }
	}


