import java.util.Scanner;

public class Appleman {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j;
		String a[] = new String[n], o = "YES";
		for (i = 0; i < n; i++)
			a[i] = in.next();

		in.close();
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++) {
				int c = 0;

				if (j > 0 && a[i].charAt(j - 1) == 'o')
					c++;
				if (j < n - 1 && a[i].charAt(j + 1) == 'o')
					c++;
				if (i > 0 && a[i - 1].charAt(j) == 'o')
					c++;
				if (i < n - 1 && a[i + 1].charAt(j) == 'o')
					c++;
				if (c % 2 != 0) {
					o = "NO";
					break;
				}
			}
		System.out.println(o);
	}
}
