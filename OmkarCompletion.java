import java.util.Scanner;

public class OmkarCompletion {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			System.out.print(1000 + " ");

			while (n-- > 1) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
