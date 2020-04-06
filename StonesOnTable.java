import java.util.Scanner;

public class StonesOnTable {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), take = 0, i;
		String s = in.next();

		for (i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				take++;
			}
		}
		System.out.println(take);
		in.close();
	}
}
