import java.util.Scanner;

public class AlenaSchedule {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], o = 0;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (a[i] == 1)
				o++;
		}
		in.close();
		for (i = 1; i < n - 1; i++) {
			if (a[i] == 0 && a[i - 1] == 1 && a[i + 1] == 1)
				o++;
		}
		System.out.println(o);
	}
}
