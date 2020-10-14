import java.util.Scanner;

public class LifeNoZeros {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String a = in.next(), b = in.next(), c = String.valueOf(Long.valueOf(a) + Long.valueOf(b));
		in.close();

		a = a.replaceAll("0", "");
		b = b.replaceAll("0", "");
		c = c.replaceAll("0", "");

		System.out.println(Long.valueOf(a) + Long.valueOf(b) == Long.valueOf(c) ? "YES" : "NO");
	}
}
