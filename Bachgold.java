import java.util.Scanner;

public class Bachgold {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;

		in.close();
		System.out.println(n / 2);

		if (n % 2 == 0) {
			for (i = 0; i < n / 2; i++) {
				System.out.print("2 ");
			}
		} else {
			for (i = 0; i < n / 2 - 1; i++) {
				System.out.print("2 ");
			}
			System.out.println(3);
		}
	}
}