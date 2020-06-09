import java.util.Scanner;

public class EhabConstruct {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt(), a, b;
		in.close();
		String o = "-1";

		outer: for (a = 1; a <= x; a++) {
			for (b = 1; b <= x; b++) {

				if (a % b == 0 && a * b > x && a / b < x) {
					o = a + " " + b;
					break outer;
				}
			}
		}
		System.out.println(o);
	}
}
