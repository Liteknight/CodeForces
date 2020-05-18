import java.util.Scanner;

public class DistinctDigits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int l = in.nextInt(), r = in.nextInt(), x = l, c = -1;
		in.close();

		while (c == -1 && x <= r) {
			String xs = String.valueOf(x);
			
			if (xs.chars().distinct().count() == xs.length()) {
				c = x;
			}
			x++;
		}
		System.out.println(c);
	}
}
