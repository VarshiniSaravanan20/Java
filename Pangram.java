package practice_java;
import java.util.Scanner;
public class Pangram {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String str1=sc.nextLine();
	 
	 Pan(str1);
 }
 public static void Pan(String str1) {
	 String res="";
	 for(int i=0;i<str1.length();i++) {
		 char ch=str1.charAt(i);
		 if(ch>='A' && ch<='Z') {
			 ch=(char)(ch+32);
		 }
		 res +=ch;
	 }
	 boolean[] visit=new boolean[26];
	 for(int i=0;i<str1.length();i++) {
		 char ch=str1.charAt(i);
		 if(ch>='a'&& ch<='z') {
			 int index=ch-'a';
			 visit [index]=true;
		 }
	 }
	 for(int i=0;i<26;i++) {
		 if(visit[i]==false) {
			 System.out.print("Not Pangram");
			 return;
		 }
	 }
	 System.out.print("Pangram");
 }
}
