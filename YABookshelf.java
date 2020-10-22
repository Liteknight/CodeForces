import java.util.Scanner;

public class YABookshelf {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, c = 0;
			String s = "";
			for (i = 0; i < n; i++)
				s += in.next();

			int i1 = s.indexOf('1'), i2 = s.lastIndexOf('1');
			char[] a = s.substring(i1, i2).toCharArray();

			for (i = 0; i < a.length; i++)
				if (a[i] == '0')
					c++;
			System.out.println(c);
		}
		in.close();
	}
}
