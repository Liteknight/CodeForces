import java.util.Scanner;

public class ProdOne {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), i, p = 1, m = 0;
		for (i = 0; i < n; i++) {

			long a = in.nextLong();
			m += Math.abs(Math.abs(a) - 1);
			p *= Math.signum(a);
		}
		in.close();
		System.out.println(p == -1 ? m + 2 : m);
	}
}
