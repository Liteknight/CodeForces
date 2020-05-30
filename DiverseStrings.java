import java.util.Arrays;
import java.util.Scanner;

public class DiverseStrings {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j;

		for (i = 0; i < n; i++) {
			String s = in.next(), o = "YES";
			char[] ca = s.toCharArray();
			Arrays.sort(ca);

			for (j = 1; j < s.length(); j++) {
				if ((int) ca[j] - (int) ca[j - 1] != 1) {
					o = "NO";
				}
			}
			System.out.println(o);
		}
		in.close();
	}
}
