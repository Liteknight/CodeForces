import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] arr = new int[n];

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr);
		for (i = 0; i < n; i++) { System.out.print(arr[i] + " "); }
		in.close();
	}
}
