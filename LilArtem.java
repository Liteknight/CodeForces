import java.util.Scanner;

public class LilArtem {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), t = 0, i = 1;
		in.close();
		
		while (n > 0) {
			if (n - i >= 0) {
				n -= i;
				t++;
			} else {
				n = 0;
			}
			i = 3 - i;
		}
		System.out.println(t);
	}
}
