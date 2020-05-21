import java.util.Scanner;

public class GregWorkout {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble(), m = Math.floor((double) n / 3), d = n - m * 3;
		int i, c = 0, bi = 0, ba = 0;

		for (i = 0; i < m; i++) {
			c += in.nextInt();
			bi += in.nextInt();
			ba += in.nextInt();
		}
		if (d >= 1) {
			c += in.nextInt();
		}
		if (d >= 2) {
			bi += in.nextInt();
		}
		in.close();

		if (c > bi && c > ba) {
			System.out.println("chest");
		} else if (bi > c && bi > ba) {
			System.out.println("biceps");
		} else {
			System.out.println("back");
		}
	}
}
