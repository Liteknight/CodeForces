import java.util.Scanner;

public class MinSquare {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int a = in.nextInt(), b = in.nextInt();
			System.out.println((int) Math.pow(Math.min(Math.max(a * 2, b), Math.max(a, b * 2)), 2));
		}
		in.close();
	}
}
