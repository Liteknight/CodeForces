import java.util.Scanner;

public class BlownGarland {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int a[] = new int[4], b[] = new int[256], i;
		in.close();

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '!')
				a[i % 4]++;
			else
				b[s.charAt(i)] = i % 4;
		}
		System.out.printf("%d %d %d %d", a[b['R']], a[b['B']], a[b['Y']], a[b['G']]);
	}
}
