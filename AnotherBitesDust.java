import java.util.Scanner;

public class AnotherBitesDust {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

		if (a > b) {
			System.out.println((c + b) * 2 + 1);
		} else if (a < b) {
			System.out.println((c + a) * 2 + 1);
		} else {
			System.out.println(c * 2 + a + b);
		}
		in.close();
	}
}
