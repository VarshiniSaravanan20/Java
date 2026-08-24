import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    Isanagram(str1,str2);
}
	public static void Isanagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			System.out.print("not anagram");
			return;
		}
		int[] count=new int[256];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++) {
			count[str2.charAt(i)]--;
		}
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.print("Anagram");
		
	}
}

