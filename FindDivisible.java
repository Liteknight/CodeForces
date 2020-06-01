import java.util.Scanner;

public class FindDivisible {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			long l = in.nextLong(), r = in.nextLong();

			System.out.println(l + " " + (l * 2));
		}
		in.close();
	}
}
