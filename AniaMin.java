import java.util.Scanner;

public class AniaMin {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i = 0;
		String s = in.next();

		in.close();
		for (i = 0; i < n; i++)
			if (k > 0) {

				System.out.print(i == 0 && n > 1 ? 1 : 0);
				if ((i == 0 && s.charAt(i) != '1') || (i > 0 && s.charAt(i) != '0')) {
					k--;
				}
			} else {
				System.out.print(s.charAt(i));
			}
	}
}