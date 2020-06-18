import java.util.Scanner;

public class PolandBall {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = 1, j, x;
		in.close();
		boolean b = true;

		while (b) {
			x = n * m + 1;
			for (j = 2; j < x; j++) {
				
				if (x % j == 0) {
					b = false;
					System.out.println(m);
					break;
				}
			}
			m++;
		}
	}
}
