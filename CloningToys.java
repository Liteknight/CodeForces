import java.util.Scanner;

public class CloningToys {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt(), y = in.nextInt() - 1;

		in.close();
		System.out.println((y > 0 && x >= y && (x - y) % 2 == 0) || (y == 0 && x == y) ? "Yes" : "No");
	}
}
