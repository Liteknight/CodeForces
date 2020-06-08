import java.util.Scanner;

public class ElevenFib {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a = 1, b = 1, c;
		in.close();

		for (i = 1; i <= n; i++) {
			if (i == b) {
				System.out.print('O');
				c = a + b;
				a = b;
				b = c;
			} else {
				System.out.print('o');
			}
		}
	}
}
