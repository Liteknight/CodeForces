import java.util.Scanner;

public class Rewards {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt(), a2 = in.nextInt(), a3 = in.nextInt(), b1 = in.nextInt(), b2 = in.nextInt(),
				b3 = in.nextInt(), n = in.nextInt(), a = a1 + a2 + a3, b = b1 + b2 + b3;
		in.close();

		double x = Math.ceil((double) a / 5), y = Math.ceil((double) b / 10);
		System.out.println(x + y <= n ? "YES" : "NO");
	}
}
