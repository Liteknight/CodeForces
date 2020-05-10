import java.util.Scanner;

public class SumRoundNumbers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i, c = 0;
			String ns = String.valueOf(n), o = "";

			for (i = 1; i <= ns.length(); i++) {
				int r = (int) (n % (Math.pow(10, i)));

				n -= r;
				if (r != 0) {
					o += r + " ";
					c++;
				}
			}
			System.out.println(c + "\n" + o);
		}
		in.close();
	}
}
