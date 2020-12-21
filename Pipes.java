import java.util.Scanner;

public class Pipes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while (q-- > 0) {

			int n = in.nextInt(), i = 0, j = 0;
			String s[] = new String[2];
			s[0] = in.next();
			s[1] = in.next();

			while (j < n) {
				if (s[i].charAt(j) - '0' < 3) {
					j++;
				} else if (s[i].charAt(j) - '0' > 2 && s[1 - i].charAt(j) - '0' > 2) {
					i = 1 - i;
					j++;
				} else {
					break;
				}
			}
			System.out.println(i == 1 && j == n ? "YES" : "NO");
		}
		in.close();
	}
}
