import java.util.Scanner;

public class WetSharkOE {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long m = Integer.MAX_VALUE, s = 0;

		for (i = 0; i < n; i++) {
			long x = in.nextLong();
			
			if (x % 2 != 0 && x < m)
				m = x;
			s += x;
		}
		in.close();
		System.out.println(s % 2 == 0 ? s : s - m);
	}
}
