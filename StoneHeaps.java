import java.util.Scanner;

public class StoneHeaps {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), a1 = a, b1 = b, c1 = c, s1 = 0, s2 = 0;
			
			// 1A+2B, then 1B+2C
			while (a1 > 0 && b1 > 1) {
				a1--;
				b1 -= 2;
				s1 += 3;
			}
			while (b1 > 0 && c1 > 1) {
				b1--;
				c1 -= 2;
				s1 += 3;
			}
			// 1B+2C, then 1A+2B
			while (b > 0 && c > 1) {
				b--;
				c -= 2;
				s2 += 3;
			}
			while (a > 0 && b > 1) {
				a--;
				b -= 2;
				s2 += 3;
			}
			System.out.println(Math.max(s1, s2));
		}
		in.close();
	}
}
