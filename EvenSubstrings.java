import java.util.Scanner;

public class EvenSubstrings {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = 0;
		String s = in.next();

		for (i = 0; i < n; i++) {
			if (s.charAt(i) % 2 == 0) {
				c += i + 1;
			}
		}
		in.close();
		System.out.println(c);
	}
}
