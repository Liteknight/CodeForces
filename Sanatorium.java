import java.util.Scanner;

public class Sanatorium {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long b = in.nextLong(), d = in.nextLong(), s = in.nextLong(), m = Math.max(Math.max(b, d), s);

		in.close();
		System.out.println(Math.max(0, m - b - 1) + Math.max(0, m - d - 1) + Math.max(0, m - s - 1));
	}
}
