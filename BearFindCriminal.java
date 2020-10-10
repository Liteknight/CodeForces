import java.util.Scanner;

public class BearFindCriminal {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt() - 1, c[] = new int[n], i, t = 0;

		for (i = 0; i < n; i++)
			t += (c[i] = in.nextInt());

		for (i = 1; a + i < n && a - i >= 0; i++)
			if (c[a + i] + c[a - i] == 1)
				t--;

		in.close();
		System.out.println(t);
	}
}
