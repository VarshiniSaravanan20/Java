package practice_java;
import java.util.Scanner;
public class Problem12 {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  int a = sc.nextInt();
    	  int b = sc.nextInt();
    	  int ans=1;
    	  for(int i=1;i<=b;i++) {
    		  ans = a*ans;
    	  }
    	  System.out.println(ans);
    	  
      }
}
