import java.util.Scanner;

public class Benches {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), s = 0, b = 0, i;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			s += a;
			b = Math.max(b, a);
		}
		in.close();
		System.out.println((int) Math.max(Math.ceil((s + m) * 1.0 / n), b) + " " + (b + m));
	}
}
