import java.util.Scanner;

public class CommentaryBoxes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), m = in.nextLong(), d = n / m * m;
		int a = in.nextInt(), b = in.nextInt();

		in.close();
		System.out.println(n % m == 0 ? 0 : Math.min((d + m - n) * a, (n - d) * b));
	}
}
