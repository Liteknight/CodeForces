import java.util.Arrays;
import java.util.Scanner;

public class TheRank {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] scores = new int[n];

		int thomasScore = in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt();
		scores[0] = thomasScore;

		for (i = 1; i < n; i++) {

			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();

			scores[i] = a + b + c + d;
		}
		Arrays.sort(scores);

		for (i = n - 1; i >= 0; i--) {

			if (scores[i] == thomasScore) {				
				System.out.println(n - i);
				break;
			}
		}
		in.close();
	}

}
