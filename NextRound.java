import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, count = 0;
		int[] arr = new int[n];

		for (i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (arr[i] >= arr[k - 1] && arr[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
