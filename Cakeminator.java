import java.util.Scanner;

public class Cakeminator {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int r = in.nextInt(), c = in.nextInt(), i, j, p = 0, q;
		String[] a = new String[r];

		for (i = 0; i < r; i++) {
			String s = in.next(), n = "";
			boolean b = true;

			q = 0;
			for (j = 0; j < c; j++) {
				if (s.charAt(j) == 'S') {
					q = 0;
					a[i] = s;
					
					b = false;
					break;
				} else if (s.charAt(j) == '.') {
					q++;
				}
				n += 'e';
			}
			if (b) {
				a[i] = n;
			}
			p += q;
		}
		for (i = 0; i < c; i++) {
			q = 0;
			for (j = 0; j < r; j++) {

				if (a[j].charAt(i) == 'S') {
					q = 0;
					break;
				} else if (a[j].charAt(i) == '.') {
					q++;
				}
			}
			p += q;
		}
		in.close();
		System.out.println(p);
	}
}
