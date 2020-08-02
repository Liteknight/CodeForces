import java.util.Scanner;

public class PileOfStones {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = 0, i;
		String s = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			if (s.charAt(i) == '+') {
				m++;
			} else {
				m--;
			}
			if (m < 0)
				m++;
		}
		System.out.println(m);
	}
}
