import java.util.Arrays;
import java.util.Scanner;

public class ArrayStab {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		Integer[] a = new Integer[n];
		
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();
		
		Arrays.sort(a);
		System.out.println(Math.min(a[n - 2] - a[0], a[n - 1] - a[1]));
	}
}
