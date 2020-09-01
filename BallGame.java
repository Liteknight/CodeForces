import java.util.Scanner;

public class BallGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, x = 1;
		
		for (i = 1; i < n; i++) {
			x += i;
			if (x>n) {
				x-=n;
			}
			System.out.print(x + " ");
		}
		in.close();
	}
}
