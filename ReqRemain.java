import java.util.Scanner;

public class ReqRemain {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			long x = in.nextLong(), y = in.nextLong(), n = in.nextLong();
			System.out.println((n - y) / x * x + y);
		}
		in.close();
	}
}
