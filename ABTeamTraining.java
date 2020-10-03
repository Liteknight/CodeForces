import java.util.Scanner;

public class ABTeamTraining {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), t = 0;
		in.close();

		while (Math.min(n, m) > 0 && Math.max(n, m) > 1) {
			if (n > m) {
				n -= 2;
				m--;
				t++;
			} else {
				n--;
				m -= 2;
				t++;
			}
		}
		System.out.println(t);
	}
}
