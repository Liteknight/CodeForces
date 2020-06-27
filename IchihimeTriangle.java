import java.util.Scanner;

public class IchihimeTriangle {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
			System.out.println(b + " " + c + " " + c);
		}
		in.close();

	}
}
