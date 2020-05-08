import java.util.Scanner;

public class MinutesBeforeNewYear {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int h = in.nextInt() + 1, m = in.nextInt();

			System.out.println(60 * (24 - h) + (60 - m));
		}
		in.close();
	}
}
