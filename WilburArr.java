import java.util.Scanner;

public class WilburArr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long s = 0, c = 0;

		for (i = 0; i < n; i++) {
			int b = in.nextInt();
			c += Math.abs(b - s);
			s = b;
		}
		in.close();
		System.out.println(c);
	}
}
