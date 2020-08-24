import java.util.Scanner;

public class TextVolume {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), mv = 0;

		while (in.hasNext()) {
			String s = in.next();
			int v = 0, i;

			for (i = 0; i < s.length(); i++) {
				if (s.substring(i, i + 1).toUpperCase().equals(s.substring(i, i + 1)))
					v++;
			}
			mv = Math.max(mv, v);
		}
		in.close();
		System.out.println(mv);
	}
}
