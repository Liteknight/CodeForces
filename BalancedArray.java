import java.util.Scanner;

public class BalancedArray {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while (t-- > 0) {

			long n = in.nextLong(), i = 2;
			String oe = "", oo = "";

			System.out.println(n % 4 == 0 ? "YES" : "NO");
			if (n % 4 == 0) {
				
				while (i < n - 1) {
					oe += i + " ";
					oo += (i - 1) + " ";
					i += 2;
				}
				System.out.printf("%s%d %s%d\n", oe, i, oo, i + n / 2 - 1);
			}
		}
		in.close();
	}
}
