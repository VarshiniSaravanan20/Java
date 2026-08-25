import java.util.*;
public class Problem7 {
    public static void Oddnum(int num) {
     int sum=0;
    	for(int i=0;i<=num;i++) {
    		if(num%2 == 0) {
    			sum =  sum +i;
    		}
    	}
    }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          Oddnum(num);
     }