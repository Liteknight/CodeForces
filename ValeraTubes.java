import java.util.Scanner;

public class ValeraTubes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), k = in.nextInt(), i, c = n * m, x = 0, y = 1, z = 1;
		in.close();

		for (i = 0; i < k; i++) {
			int t = c / (k - i);
			c -= t;
			System.out.print(t + " ");
			
			while (t-- > 0) {
				x += z;
				if (x < 1 || x > m) {
					
					z = -z;
					x += z;
					y++;
				}
				System.out.print(y + " " + x + " ");
			}
			System.out.println();
		}
	}
}
