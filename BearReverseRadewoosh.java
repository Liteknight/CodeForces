import java.util.Scanner;

public class BearReverseRadewoosh {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), c = in.nextInt(), i, lScore = 0, rScore = 0, lStart = 0, rStart = 0;
		int[][] problems = new int[n][2];

		for (i = 0; i < n; i++) {
			problems[i][0] = in.nextInt();
		}
		for (i = 0; i < n; i++) {
			problems[i][1] = in.nextInt();
		}
		for (int[] j : problems) {
			lScore += Math.max(0, j[0] - c * (j[1] + lStart));
			lStart += j[1];
		}
		for (i = n - 1; i >= 0; i--) {
			rScore += Math.max(0, problems[i][0] - c * (problems[i][1] + rStart));
			rStart += problems[i][1];
		}
		if (lScore > rScore) {
			System.out.println("Limak");
		} else if (lScore < rScore) {
			System.out.println("Radewoosh");
		} else {
			System.out.println("Tie");
		}
		in.close();
	}
}
