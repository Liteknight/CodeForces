import java.util.Scanner;

public class EugenyArray {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), n1 = 0, p1 = 0, i;
		StringBuilder s = new StringBuilder();

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a == 1) {
				p1++;
			} else {
				n1++;
			}
		}
		for (i = 0; i < m; i++) {
			int l = in.nextInt(), r = in.nextInt(), d = r - l + 1;
			s.append(d % 2 == 0 && Math.min(n1, p1) * 2 >= d ? 1 + "\n" : 0 + "\n");
		}
		in.close();
		System.out.println(s.toString());
	}
}
