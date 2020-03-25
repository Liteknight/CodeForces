import java.util.Scanner;

public class GradeAllocation {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;

		for (i = 0; i < t; i++) {
			int n = in.nextInt(), m = in.nextInt(), j;
			int[] arr = new int[n];
			boolean over = false;

			for (j = 0; j < n; j++) {
				int a = in.nextInt();
				arr[j] = a;
			}

			while (arr[0] < m && !over) {
				for (j = 1; j < n; j++) {
					
					while (arr[j] > 0 && arr[0] < m) {
						arr[j]--;
						arr[0]++;
					}
				}
				over = true;
			}
			System.out.println(arr[0]);
		}
		in.close();
	}
}
