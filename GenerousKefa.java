import java.util.Scanner;

public class GenerousKefa {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, a[] = new int[26], m = 0;
		String s = in.next();
		in.close();
		
		for (i = 0; i < n; i++) {
			a[s.charAt(i) - 97]++;
			m = Math.max(m, a[s.charAt(i) - 97]);
		}
		System.out.println(m <= k ? "YES" : "NO");
	}
}
