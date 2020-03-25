import java.util.Arrays;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] arr = new int[n];

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr);
		
		if (arr.length % 2 == 0) {
			System.out.println(arr[arr.length / 2 - 1]);
		} else {
			System.out.println(arr[arr.length / 2]);
		}
		in.close();
	}
}
