import java.util.Scanner;

public class ThreePilesOfCandies {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt(), i;

		for (i = 0; i < q; i++) {
			long a = in.nextLong(), b = in.nextLong(), c = in.nextLong();

			System.out.println((a + b + c) / 2);
		}
		in.close();
	}
}
