import java.util.Scanner;
public class Minimumofelement {
         public static void main(String[] args) {
        	 Scanner sc = new Scanner(System.in);
        	 int size = sc.nextInt();
        	 int[] arr = new int[size];
        	 for(int i=0;i<size;i++) {
        		 arr[i] = sc.nextInt();
        		 }
        	 Submeth(arr,size);
         }
         public static void Submeth(int arr[],int size) {
        	 int min = arr[0];
        	 for(int i=0;i<size;i++) {
        		 if(arr[i]<min) {
            		 min = arr[i];
            	 }
        	 }
        	 System.out.println(min);
         }
}

