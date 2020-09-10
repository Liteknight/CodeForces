import java.util.Scanner;

public class Mult2Div6 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), x = 0, y = 0;
			while (n % 2 == 0) {
				n /= 2;
				x++;
			}
			while (n % 3 == 0) {
				n /= 3;
				y++;
			}
			System.out.println(n == 1 && x <= y ? 2 * y - x : -1);
		}
		in.close();
	}
}
