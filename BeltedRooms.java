import java.util.Scanner;

public class BeltedRooms {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, c = 0;
			String s = in.next();

			if (!s.contains(">") || !s.contains("<")) {
				c = n;
			} else {
				for (i = 0; i < n; i++)
					if (s.charAt(i) == '-' || s.charAt((i + 1) % n) == '-')
						c++;
			}
			System.out.println(c);
		}
		in.close();
	}
}
