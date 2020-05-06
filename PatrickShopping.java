import java.util.Scanner;

public class PatrickShopping {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int s1 = in.nextInt(), s2 = in.nextInt(), b = in.nextInt();

		in.close();
		if (s1 < s2) {
			System.out.println(s1 + Math.min(s1 + s2, b) + Math.min(s2, s1 + b));
		} else {
			System.out.println(s2 + Math.min(s1 + s2, b) + Math.min(s1, s2 + b));
		}
	}
}