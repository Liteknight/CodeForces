import java.util.Scanner;

public class BeautifulDiv {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = 0, o = 0;
		in.close();

		while ((Math.pow(2, k) - 1) * Math.pow(2, k - 1) <= n) {
			double x = (Math.pow(2, k) - 1) * Math.pow(2, k - 1);

			if (n % x == 0)
				o = (int) x;
			k++;
		}
		System.out.println(o);
	}
}
