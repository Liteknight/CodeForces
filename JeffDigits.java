import java.util.Scanner;

public class JeffDigits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, f = 0, z = 0;
		for (i = 0; i < n; i++)
			if (in.nextInt() == 5) {
				f++;
			} else {
				z++;
			}
		in.close();
		if (z == 0) {
			System.out.println(-1);
		} else if (f < 9) {
			System.out.println(0);
		} else {
			while ((f -= 9) >= 0) {
				System.out.print(555555555);
			}
			while (z-- > 0) {
				System.out.print(0);
			}
		}
	}
}
