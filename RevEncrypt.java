import java.util.Scanner;

public class RevEncrypt {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j;
		String t = in.next(), s = "";
		in.close();

		for (i = 2; i <= n; i++)
			if (n % i == 0) {
				for (j = i - 1; j >= 0; j--)
					s += t.charAt(j);
				
				s += t.substring(i);
				t = s;
				s = "";
			}
		System.out.println(t);
	}
}
