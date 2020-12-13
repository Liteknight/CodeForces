import java.util.Scanner;

public class LuckySumDigs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder s = new StringBuilder();
		in.close();

		while (n > 0) {
			if (n % 7 == 0) {
				n -= 7;
				s.append(7);
			} else {
				n -= 4;
				s.append(4);
			}
		}
		System.out.println(n == 0 ? s.toString() : -1);
	}
}
