import java.util.Scanner;

public class Tetris {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, a[] = new int[n], o = 1000;
		for (i = 0; i < m; i++)
			a[in.nextInt() - 1]++;

		in.close();
		for (i = 0; i < n; i++)
			o = Math.min(o, a[i]);
		System.out.println(o);
	}
}
