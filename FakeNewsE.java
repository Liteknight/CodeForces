import java.util.Scanner;

public class FakeNewsE {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), h = "heidi";
		in.close();
		int i, j = 0;

		for (i = 0; i < s.length(); i++) {
			if (j < 5) {
				if (s.charAt(i) == h.charAt(j)) {
					j++;
				}
			}
		}
		System.out.println(j > 4 ? "YES" : "NO");
	}
}
