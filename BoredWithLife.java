import java.util.Scanner;

public class BoredWithLife {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong(), o = 1;
		in.close();

		for (int i = 2; i <= Math.min(a, b); i++) {
			o *= i;
		}
		System.out.println(o);
	}
}
