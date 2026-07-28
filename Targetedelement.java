package practice_java;
import java.util.Scanner;
public class Targetedelement {
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int size = sc.nextInt();
        	int[] arr = new int[size];
        	int target = sc.nextInt();
        	for(int i =0;i<size;i++) {
        		arr[i]=sc.nextInt();
        	}
        	Submeth(arr,size,target);
        }
        
        public static void Submeth(int arr[],int size,int target) {
        	for(int i=0;i<size;i++) {
        		if(target == arr[i]) {
        			System.out.println("Yes");
        			return;
        		}
        	}
        	System.out.println("-1");
        }
}
