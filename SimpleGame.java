import java.util.Scanner;

public class SimpleGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), m = in.nextLong();

		in.close();
		System.out.println(n == 1 ? 1 : m > n / 2 ? m - 1 : m + 1);
	}
}
