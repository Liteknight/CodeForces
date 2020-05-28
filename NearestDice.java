import java.util.Scanner;

public class NearestDice {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), i, f = 0, d = 0, s = 0;
		in.close();

		for (i = 1; i <= 6; i++) {
			if (Math.abs(a - i) < Math.abs(b - i)) {
				f++;
			} else if (Math.abs(a - i) > Math.abs(b - i)) {
				s++;
			} else {
				d++;
			}
		}
		System.out.println(f + " " + d + " " + s);
	}
}
