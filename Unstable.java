import java.util.Scanner;

public class Unstable {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			long n = in.nextLong(), m = in.nextLong();
			System.out.println(Math.min(2, n - 1) * m);
		}
		in.close();
	}
}
