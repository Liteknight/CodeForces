import java.util.Scanner;

public class DiverseSubS {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		String s = in.next(), o = "NO";
		in.close();

		for (i = 0; i < n - 1; i++)
			if (s.charAt(i) != s.charAt(i + 1)) {
				o = "YES\n" + s.substring(i, i + 2);
				break;
			}
		System.out.println(o);
	}
}
