package practice_java;
import java.util.Scanner;
public class Frequencyinstring {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 String str = sc.nextLine();
    	 Frequency(str);
     }
     public static void Frequency(String str) {
    	 char[] ch=str.toCharArray();
    		 boolean[] visit=new boolean[str.length()];
    	for(int i=0;i<str.length();i++) {
    		if(visit[i]) {
    			continue;
    		}
    		int count=1;
    		for(int j=i+1;j<str.length();j++) {
    			if(ch[i]==ch[j]) {
    				count++;
    				visit[j]=true;
    			}
    		}
    		System.out.println(ch[i] +"-"+count);
    	 }
     }
}
