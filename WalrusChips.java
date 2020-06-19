import java.util.Scanner;

public class WalrusChips {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), x = 0, i;
		
		boolean f = false;
		in.close();

		while (x < m && !f) {
			for (i = 1; i <= n; i++) {
				
				if (x + i > m) {
					f = true;
					break;
				}
				x += i;
			}
		}
		System.out.println(m - x);
	}
}
