import java.util.Scanner;

public class PonyCrystal {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		in.close();

		for (i = 0; i < n; i++) {
			int d = Math.abs(i - n / 2), j;

			for (j = 0; j < d; j++) {
				System.out.print('*');
			}
			for (j = 0; j < n - d * 2; j++) {
				System.out.print('D');
			}
			for (j = 0; j < d; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
