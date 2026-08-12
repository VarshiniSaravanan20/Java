package practice_java;
import java.util.Scanner;
public class SumPrime {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 prime(n);
	    }

	    public static void prime(int n) {
	    	int sum = 0;
	    	while (n > 0) {
	    		sum = sum + n % 10;
	    		n = n / 10;
	    	}
	    	int count = 0;
	    	for (int i = 1; i <= sum; i++) {
	    		if (sum % i == 0) {
	    			count++;
	    		}
	    	}
	    	if (count == 2)
	    		System.out.println("Prime");
	    	else
	    		System.out.println("Not Prime");
	    }
}

	    		


}
