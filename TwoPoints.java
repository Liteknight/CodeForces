import java.util.Scanner;

public class TwoPoints {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		while (q-- > 0) {
			long l1 = in.nextLong(), r1 = in.nextLong(), l2 = in.nextLong(), r2 = in.nextLong();

			if (l1 == r2) {
				l1++;
			}
			System.out.println(l1 + " " + r2);
		}
		in.close();
	}
}
