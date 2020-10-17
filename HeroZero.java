import java.util.Scanner;

public class HeroZero {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long n = in.nextLong(), k = in.nextLong(), s = 0;

			while (n > 0) {
				if (n % k == 0) {
					n /= k;
					s++;
				} else {
					s += n % k;
					n -= n % k;
				}
			}
			System.out.println(s);
		}
		in.close();
	}
}
