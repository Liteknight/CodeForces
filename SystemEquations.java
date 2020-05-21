import java.util.Scanner;

public class SystemEquations {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), a, b, c = 0;
		in.close();

		for (a = 0; a < 40; a++) {
			for (b = 0; b < 40; b++) {

				if (Math.pow(a, 2) + b == n && a + Math.pow(b, 2) == m) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
