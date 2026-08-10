package practice_java;
import java.util.Scanner;
public class Array2DAbsolute {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int row=sc.nextInt();
	 int col=sc.nextInt();
	 int[][] arr=new int[row][col];
	 for(int i=0;i<row;i++) {
		 for(int j=0;i<col;j++) {
			 arr[row][col]=sc.nextInt();
		 }
	 }
	 Difference(arr,row,col);
}
	public static void Difference(int[][] arr, int row, int col) {

	    int sum1 = 0;
	    int sum2 = 0;

	    for(int i = 0; i < row; i++) {

	        sum1 += arr[i][i];

	        sum2 += arr[i][col - 1 - i];
	    }

	    int diff = sum1 - sum2;

	    if(diff < 0) {
	        diff = -diff;
	    }

	    System.out.println(diff);
	}
}
