import java.util.Scanner;

public class IlyaColorWalk {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = 0, r = n - 1, c[] = new int[n];

		for (i = 0; i < n; i++)
			c[i] = in.nextInt();
		in.close();

		while (c[l] == c[n - 1])
			l++;
		while (c[r] == c[0])
			r--;
		System.out.println(Math.max(n - l - 1, r));
	}
}
