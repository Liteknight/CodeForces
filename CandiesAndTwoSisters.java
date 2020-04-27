import java.util.Scanner;

public class CandiesAndTwoSisters {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			System.out.println((long) (Math.ceil(in.nextDouble() / 2) - 1));
		}
		in.close();
	}
}
