import java.util.Scanner;

public class TeamCards {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		in.close();

		if (m > n * 2 + 2 || m < n - 1) {
			System.out.println(-1);
			return;
		}
		StringBuilder sb = new StringBuilder();
		while (n > 0 || m > 0) {
			if (n == m) {
				sb.append("10");
				n--;
				m--;	
			} else if (m > n && n > 0) {
				sb.append("110");
				n--;
				m -= 2;
			} else if (n > m) {
				sb.append("0");
				n--;
			} else {
				sb.append("1");
				m--;
			}
		}
		System.out.println(sb.toString());
	}
}
