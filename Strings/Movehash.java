import java.util.Scanner;
public class Movehash {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        moveHash(str);
    }

    public static void moveHash(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '#') {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print("#");
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != '#') {
                System.out.print(str.charAt(i));
            }
        }
    }
}

