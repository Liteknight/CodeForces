import java.util.Scanner;

public class HappyBdayPoly {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long n = in.nextLong(), o = 0;
			
			for (int i = 1; i < 10; i++) {
				long c = i;
				while (c <= n) {
					c = c * 10 + i;
					o++;
				}
			}
			System.out.println(o);
		}
		in.close();
	}
}
