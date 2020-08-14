import java.util.Scanner;

public class IlyaQueries {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n[] = new int[s.length()], m = in.nextInt(), i;

		for (i = 1; i < s.length(); i++) {
			n[i] = n[i - 1];
			if (s.charAt(i) == s.charAt(i - 1))
				n[i]++;
		}
		while (m-- > 0) {
			int l = in.nextInt(), r = in.nextInt();
			System.out.println(n[r - 1] - n[l - 1]);
		}
		in.close();
	}
}
