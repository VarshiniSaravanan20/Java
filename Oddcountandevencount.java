import java.util.Scanner;
public class Oddcountandevencount {
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
		int oddcount = 0;
		int evencount = 0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2 == 0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.print(evencount+"\n"+oddcount);
	}
}

