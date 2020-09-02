import java.util.Arrays;
import java.util.Scanner;

public class SpykeTalks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], t = 0, i;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(a);
		for (i = 0; i < n - 1; i++) {

			if (i < n - 2 && a[i] != 0 && a[i] == a[i + 2]) {
				t = -1;
				break;
			} else if (a[i] != 0 && a[i] == a[i + 1]) {
				t++;
			}
		}
		System.out.println(t);
	}
}
