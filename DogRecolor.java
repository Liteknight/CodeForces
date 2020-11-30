import java.util.Scanner;

public class DogRecolor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[27], i, m = 0;
		String s = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			a[s.charAt(i) - 97]++;
			m = Math.max(m, a[s.charAt(i) - 97]);
		}
		System.out.println(n == 1 || m > 1 ? "Yes" : "No");
	}
}
