import java.util.Scanner;

public class WaterBuying {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		
		while (q-- > 0) {
			long n = in.nextLong(), a = in.nextLong(), b = in.nextLong();

			if (b / 2 < a) {
				System.out.println(n / 2 * b + n % 2 * a);
			} else {
				System.out.println(n * a);
			}
		}
		in.close();
	}
}
