import java.util.Arrays;
import java.util.Scanner;

public class Equality {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i;
		
		String s = in.next();
		in.close();
		int[] a = new int[k];

		for (i = 0; i < n; i++) {
			a[s.charAt(i) - 'A']++;
		}
		Arrays.sort(a);
		System.out.println(a[0] * k);
	}
}
