import java.util.Scanner;

public class BalRatChange {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j = 0;
		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			
			if (a % 2 == 0) {
				System.out.println(a / 2);
			} else {
				System.out.println(j % 2 == 0 ? (int) Math.floor(a / 2.0) : (int) Math.ceil(a / 2.0));
				j++;
			}
		}
		in.close();
	}
}
