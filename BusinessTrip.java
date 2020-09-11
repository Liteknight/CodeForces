import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int k = in.nextInt(), i, a[] = new int[12], m = 0;
		for (i = 0; i < 12; i++)
			a[i] = in.nextInt();

		in.close();
		Arrays.sort(a);
		for (i = 11; i >= 0; i--) {
			if (k < 1)
				break;
			k -= a[i];
			m++;
		}
		System.out.println(k < 1 ? m : -1);
	}
}
