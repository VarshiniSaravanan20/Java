package practice_java;
import java.util.Scanner;
public class Problem13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int rem;
		int count = 0;
		while(a>0) {
			rem = a%10;
			for(int i =1;i<=a;i++) {
				if(rem % i == 0) {
					count=count+1;
				}
				
			}
			a = a/10;
			
			 if (count != 2 && count%2!=0) {
		            System.out.println("Prime Number");
		        } 
			 else {
		            System.out.println("Not a Prime Number");
		        }
		    }

		}
	}


