import java.util.Scanner;
public class Addcolumn {
	 public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int r=sc.nextInt();
    	 int c=sc.nextInt();
    	 int[][] arr=new int[r][c];
    	 for(int i=0;i<r;i++) {
    		 for(int j=0;i<c;j++) {
    			 arr[r][c]=sc.nextInt();
    		 }
    	 }
    	 Row(arr,r,c);
     }
     public static void Row(int[][] arr,int r,int c) { 
    	 for(int j=0;j<c;j++) {
    		 int sum=0;
    		 for(int i=0;i<r;i++) {
    			 sum += arr[i][j];
    		 }
    		 System.out.println(sum);
    	 }
     }

}

