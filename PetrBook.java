import java.util.Scanner;

public class PetrBook {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[7];

		for (i = 0; i < 7; i++)
			a[i] = in.nextInt();
		in.close();

		i = 0;
		while (n > 0) {
			n -= a[i % 7];

			if (n < 1)
				System.out.println(i % 7 + 1);
			i++;
		}
	}
}
