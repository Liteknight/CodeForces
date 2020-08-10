import java.util.Scanner;

public class SplittingTeams {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), o = 0, t = 0, m = 0;
		while (n-- > 0) {

			int a = in.nextInt();
			if (a == 1) {
				o++;
			} else {
				t++;
			}
		}
		int x = Math.min(o, t);
		m += x;
		o -= x;
		
		System.out.println(m + o / 3);
		in.close();
	}
}
