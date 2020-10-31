import java.util.Scanner;

public class PlayingPaper {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong(), n = 0;
		in.close();

		while (a > 0 && b > 0)
			if (a > b) {
				n += a / b;
				a -= a / b * b;
			} else {
				n += b / a;
				b -= b / a * a;
			}
		System.out.println(n);
	}
}
