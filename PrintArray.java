package practice_java;
import java.util.Scanner;
public class PrintArray {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   int rows=sc.nextInt();
    	   int colns=sc.nextInt();
    	   int[][] arr=new int[rows][colns];
    	   for(int i=0;i<rows;i++) {
    		   for(int j=0;j<colns;j++) {
    			   arr[i][j]=sc.nextInt();
    		   }
    	     }
    	   Print(arr,rows,colns);
       }
       public static void Print(int[][] arr,int r,int c) {
    	   for(int i=0;i<r;i++) {
    		   for(int j=0;j<c;j++) {
    			   System.out.print(arr[i][j]+" ");
    		   }
    		   System.out.println();
    	   }
       }
}
