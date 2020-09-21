import java.util.Scanner;

public class Joysticks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt(), a2 = in.nextInt(), c = 0;
		in.close();

		while (a1 > 0 && a2 > 0) {
			if (a1 <= a2) {
				a1 += 1;
				a2 -= 2;
			} else {
				a1 -= 2;
				a2 += 1;
			}
			c++;
		}
		System.out.println(c + Math.min(a1, a2));
	}
}
