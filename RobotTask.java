import java.util.Scanner;

public class RobotTask {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = 0, a[] = new int[n], o = -1;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		while (c < n) {
			o++;
			for (i = 0; i < n; i++)
				if (a[i] <= c) {
					a[i] = 1001;
					c++;
				}
			if (c < n) {
				o++;
				for (i = n - 1; i >= 0; i--)
					if (a[i] <= c) {
						a[i] = 1001;
						c++;
					}
			}
		}
		System.out.println(o);
	}
}
