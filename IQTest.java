import java.util.Scanner;

public class IQTest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, even = 0, odd = 0, ei = -1, oi = -1;

		for (i = 0; i < n; i++) {
			int x = in.nextInt();

			if (x % 2 == 0) {
				even++;
				ei = i;
			} else {
				odd++;
				oi = i;
			}
		}
		in.close();
		
		if (even > odd) {
			System.out.println(oi + 1);
		} else {
			System.out.println(ei + 1);
		}
	}
}
