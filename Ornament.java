import java.util.Scanner;

public class Ornament {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int y = in.nextInt(), b = in.nextInt() - 1, r = in.nextInt() - 2;

		in.close();
		System.out.println(3 * Math.min(Math.min(y, b), r) + 3);
	}
}
