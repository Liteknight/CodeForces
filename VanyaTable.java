import java.util.Scanner;

public class VanyaTable {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, s = 0;
		for (i = 0; i < n; i++) {

			int x1 = in.nextInt(), x2 = in.nextInt(), y1 = in.nextInt(), y2 = in.nextInt();
			s += (Math.abs(x1 - y1) + 1) * (Math.abs(x2 - y2) + 1);
		}
		in.close();
		System.out.println(s);
	}
}
