import java.util.Scanner;

public class MahmoudEhabMEX {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x = in.nextInt(), i, a[] = new int[101], c = 0;

		for (i = 0; i < n; i++)
			a[in.nextInt()]++;
		in.close();

		for (i = 0; i < x; i++)
			c += a[i];
		System.out.println(a[x] == 1 ? x - c + 1 : x - c);
	}
}
