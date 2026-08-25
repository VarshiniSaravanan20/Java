import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==n){
            System.out.print("palindrome");

        }
        else{
            System.out.print("not palindrome");
        }
    }
}