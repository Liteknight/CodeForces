import java.util.Scanner;

public class SerejaMugs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), s = in.nextInt(), i, m = 0, sum = 0;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			m = Math.max(m, a);
			sum += a;
		}
		in.close();
		System.out.println(sum - m <= s ? "YES" : "NO");
	}
}
