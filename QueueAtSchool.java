import java.util.Scanner;

public class QueueAtSchool {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), t = in.nextInt(), i, j;
		String s = in.next();
		char[] a = new char[n];

		in.close();
		for (i = 0; i < n; i++) {
			a[i] = s.charAt(i);
		}

		for (j = 0; j < t; j++) {
			for (i = 0; i < n; i++) {
				try {
					if (a[i] == 'B' && a[i + 1] == 'G') {
						a[i + 1] = 'B';
						a[i] = 'G';
						i++;
					}
				} catch (Exception e) {
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(a[i]);
		}
	}
}
