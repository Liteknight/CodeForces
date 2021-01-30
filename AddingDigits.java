import java.util.Scanner;

public class AddingDigits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt() * 10, b = in.nextInt(), n = in.nextInt(), i, j;
		in.close();

		for (i = 9; i >= 0; i--) {
			if ((a + i) % b == 0) {
				System.out.print(a + i);
				
				for (j = 0; j < n - 1; j++)
					System.out.print(0);
				return;
			}
		}
		System.out.println(-1);
	}
}
