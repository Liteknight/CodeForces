import java.util.Scanner;

public class RemProgress {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), x = in.nextInt();
			System.out.println(x * 2);
		}
		in.close();
	}
}
