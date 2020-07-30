import java.util.Scanner;

public class PhoneNumbers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), ec = 0, i;
		String s = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			if (s.charAt(i) == '8') {
				ec++;
			}
		}
		System.out.println(Math.min(n / 11, ec));
	}
}
