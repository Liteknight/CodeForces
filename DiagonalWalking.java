import java.util.Scanner;

public class DiagonalWalking {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = n;
		String s = in.next();

		for (i = 0; i < n - 1; i++) {
			if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'U' || s.charAt(i) == 'U' && s.charAt(i + 1) == 'R') {
				l--;
				i++;
			}
		}
		in.close();
		System.out.println(l);
	}
}
