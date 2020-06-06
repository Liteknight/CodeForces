import java.util.Scanner;

public class ChangeVolume {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int a = in.nextInt(), b = in.nextInt(), d = Math.abs(a - b);

			System.out.println(d / 5 + (d % 5 / 2) + (d % 5 % 2));
		}
		in.close();
	}
}
