import java.util.Scanner;

public class DonutShops {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			long a = in.nextLong(), b = in.nextLong(), c = in.nextLong();
			System.out.println((a < c ? 1 : -1) + " " + (a * b > c ? b : -1));
		}
		in.close();
	}
}
