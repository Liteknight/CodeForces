import java.util.Scanner;

public class AlphabetRem {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, j;
		char[] c = in.next().toCharArray();
		in.close();

		for (i = 0; i < 26; i++)
			for (j = 0; j < n; j++)
				if (k > 0 && c[j] - 'a' == i) {
					c[j] = '*';
					k--;
				}
		for (i = 0; i < n; i++)
			if (c[i] != '*')
				System.out.print(c[i]);
	}
}
