import java.util.Scanner;

public class OmkarWater {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long n = in.nextLong(), i, l = -1, c = 0;

			for (i = 0; i < n; i++) {
				long a = in.nextLong();

				if (l >= 0)
					c += Math.max(0, l - a);
				l = a;
			}
			System.out.println(c);
		}
		in.close();
	}
}
