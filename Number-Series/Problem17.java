
import java.util.Scanner;
public class Problem17 {
	public static void Armstrong(int a){
		int temp = a;
		int sum = 0;
		while(temp>0) {
			int rem = temp%10;
			sum = sum +(rem*rem*rem);
			temp = temp/10;
		}
		if(sum == a) {
			System.out.println(sum+"Armstrong");
		}
		else {
			System.out.println(sum+"Not Armstrong");
		}
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	Armstrong(a);
    }
      }
