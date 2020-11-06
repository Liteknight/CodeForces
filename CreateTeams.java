import java.util.Arrays;
import java.util.Scanner;

public class CreateTeams {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), x = in.nextInt(), a[] = new int[n], i, c = 1, o = 0;
			for (i = 0; i < n; i++)
				a[i] = in.nextInt();
			Arrays.sort(a);
			
			for (i = n - 1; i >= 0; i--) {
				if (a[i] * c >= x) {
					o++;
					c = 1;
				} else {
					c++;
				}
			}
			System.out.println(o);
		}
		in.close();
	}
}
