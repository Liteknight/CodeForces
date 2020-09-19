import java.util.Scanner;

public class Game23 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), c = 0;
		double d = m * 1.0 / n;

		while (d % 3 == 0) {
			d /= 3;
			c++;
		}
		while (d % 2 == 0) {
			d /= 2;
			c++;
		}
		in.close();
		System.out.println(d == 1 ? c : -1);
	}
}
