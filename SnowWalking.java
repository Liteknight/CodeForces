import java.util.Scanner;

public class SnowWalking {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while (q-- > 0) {
			StringBuilder s = new StringBuilder(), o = new StringBuilder();
			s.append(in.next());
			int a[] = new int[4], i;

			for (i = 0; i < s.length(); i++) {
				switch (s.charAt(i)) {
				case 'L':
					a[0]++;
					break;
				case 'R':
					a[1]++;
					break;
				case 'U':
					a[2]++;
					break;
				case 'D':
					a[3]++;
					break;
				}
			}
			if (Math.min(a[0], a[1]) == 0 || Math.min(a[2], a[3]) == 0) {
				if (a[0] > 0 && a[1] > 0) {
					System.out.println("2\nLR");
				} else if (a[2] > 0 && a[3] > 0) {
					System.out.println("2\nUD");
				} else {
					System.out.println(0);
				}
			} else {
				for (i = 0; i < Math.min(a[2], a[3]); i++)
					o.append("U");
				for (i = 0; i < Math.min(a[0], a[1]); i++)
					o.append("R");
				for (i = 0; i < Math.min(a[2], a[3]); i++)
					o.append("D");
				for (i = 0; i < Math.min(a[0], a[1]); i++)
					o.append("L");
				System.out.println(o.length() + "\n" + o);
			}
		}
		in.close();
	}
}
