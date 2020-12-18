import java.util.Scanner;

public class SerialKiller {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String p1 = in.next(), p2 = in.next();
		int n = in.nextInt(), i;

		System.out.println(p1 + " " + p2);
		for (i = 0; i < n; i++) {
			String s1 = in.next(), s2 = in.next();

			if (s1.equals(p1)) {
				p1 = s2;
			} else {
				p2 = s2;
			}
			System.out.println(p1 + " " + p2);
		}
		in.close();
	}
}
