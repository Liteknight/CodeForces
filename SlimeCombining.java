import java.util.Scanner;

public class SlimeCombining {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		while (n > 0) {
			int k = 1, s = 1;
			while (k * 2 <= n) {
				k *= 2;
				s++;
			}
			n -= k;
			System.out.print(s + " ");
		}
	}
}
