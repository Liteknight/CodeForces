import java.util.Scanner;

public class BankRobbery {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong(), c = in.nextLong(), t = 0;
		int n = in.nextInt(), i;

		for (i = 0; i < n; i++) {
			long x = in.nextLong();
			if (x > b && x < c) {
				t++;
			}
		}
		in.close();
		System.out.println(t);
	}
}
