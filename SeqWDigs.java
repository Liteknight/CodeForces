import java.util.Scanner;

public class SeqWDigs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			long a = in.nextLong(), k = in.nextLong();
			while (k-- > 1) {
				long c = a, min = 10, max = -1;

				while (c > 0) {
					min = Math.min(min, c % 10);
					max = Math.max(max, c % 10);
					c /= 10;
				}
				if (min < 1) {
					break;
				}
				a += max * min;
			}
			System.out.println(a);
		}
		in.close();
	}
}
