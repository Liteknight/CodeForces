import java.util.Scanner;

public class PineappleBark {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long t = in.nextLong(), s = in.nextLong(), x = in.nextLong();

		in.close();
		x -= t;
		System.out.println(((x % s == 0 || x % s == 1) && x > 1) || x == 0 ? "YES" : "NO");
	}
}
