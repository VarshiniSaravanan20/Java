package workspace;
import java.util.*;
public class Problem8 {
    public static void Oddnum(int n,int sum) {
    	for( int i=0;i<=n;i++) {
    		if(i%2 == 0) {
    			sum =  sum +i;
    		}
    	}
    }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum = 0;
          Oddnum(n,sum);
     }
}