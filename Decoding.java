import java.util.Scanner;

public class Decoding {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		String s = in.next(), d = "";

		for (i = 0; i < n; i++) {
			if (n % 2 == 0) {
				if (i % 2 == 0) {
					d = s.charAt(i) + d;
				} else {
					d += s.charAt(i);
				}
			} else {
				if (i % 2 != 0) {
					d = s.charAt(i) + d;
				} else {
					d += s.charAt(i);
				}
			}
		}
		in.close();
		System.out.println(d);
	}
}
