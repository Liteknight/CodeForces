import java.util.Scanner;

public class DoubleCola {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		String[] a = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

		while (n > 5) {
			n -= 4;
			n /= 2;
		}
		System.out.println(a[n - 1]);
	}
}
