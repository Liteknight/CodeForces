import java.util.Arrays;
import java.util.Scanner;

public class FastFood {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int x[] = new int[3], i, o = 0;
			for (i = 0; i < 3; i++)
				x[i] = in.nextInt();
			
			Arrays.sort(x);
			int a = x[2], b = x[1], c = x[0];

			if (a != 0) {
				a--;
				o++;
			}
			if (b != 0) {
				b--;
				o++;
			}
			if (c != 0) {
				c--;
				o++;
			}
			if (a != 0 && b != 0) {
				a--;
				b--;
				o++;
			}
			if (a != 0 && c != 0) {
				a--;
				c--;
				o++;
			}
			if (b != 0 && c != 0) {
				b--;
				c--;
				o++;
			}
			if (a != 0 && b != 0 && c != 0) {
				a--;
				b--;
				c--;
				o++;
			}
			System.out.println(o);
		}
		in.close();
	}
}