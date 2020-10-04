import java.util.Scanner;

public class SubseqHate {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			char[] c = in.next().toCharArray();
			int i, m = Integer.MAX_VALUE;

			for (i = 0; i < c.length; i++) {
				int s = 0, j;
				
				for (j = 0; j < i; j++)
					if (c[i] != c[j])
						s++;

				for (j = i + 1; j < c.length; j++)
					if (c[i] == c[j])
						s++;
				m = Math.min(m, s);
			}
			System.out.println(m);
		}
		in.close();
	}
}