import java.util.Scanner;

public class Hotelier {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j;
		String s = in.next();

		in.close();
		int[] a = new int[10];		
		for (i = 0; i < n; i++) {
			char c = s.charAt(i);

			if (c == 'L') {
				for (j = 0; j < 10; j++) {
					if (a[j] == 0) {
						a[j]++;
						break;
					}
				}
			} else if (c == 'R') {
				for (j = 9; j >= 0; j--) {
					if (a[j] == 0) {
						a[j]++;
						break;
					}
				}
			} else {
				a[c - '0'] = 0;
			}
		}
		for (int o : a) {
			System.out.print(o);
		}
	}
}
