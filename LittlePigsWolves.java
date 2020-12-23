import java.util.Scanner;

public class LittlePigsWolves {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, c = 0;
		String s[] = new String[n];

		for (i = 0; i < n; i++)
			s[i] = in.next();
		in.close();

		for (i = 0; i < n; i++)
			for (j = 0; j < m; j++)

				if (s[i].charAt(j) == 'W'
						&& ((i > 0 && s[i - 1].charAt(j) == 'P') || (i < n - 1 && s[i + 1].charAt(j) == 'P')
								|| (j > 0 && s[i].charAt(j - 1) == 'P' || (j < m - 1 && s[i].charAt(j + 1) == 'P'))))
					c++;
		System.out.println(c);
	}
}
