import java.util.Scanner;

public class CrazyComputer {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), c = in.nextInt(), l = in.nextInt(), w = 1;

		while (n-- > 1) {
			int t = in.nextInt();
			
			if (t - l <= c) {
				w++;
			} else {
				w = 1;
			}
			l = t;
		}
		in.close();
		System.out.println(w);
	}
}
