import java.util.Scanner;

public class EvenSubsetSum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;

		for (i = 0; i < t; i++) {

			int n = in.nextInt(), j, l, r, num = -1;
			int[] arr = new int[n];
			String sub = "";
			boolean found = false;

			for (j = 0; j < n; j++) { arr[j] = in.nextInt(); }
			
			for (l = 0; l < n; l++) {
				
				if (found) { break; }
				
				for (r = l; r < n; r++) {
					
					if (found) { break; }

					int sum = 0, x;

					for (x = l; x < r + 1; x++) {
						sum += arr[x];
					}

					if (sum % 2 == 0 && sum != 0) {
						num++;
						
						for (x = l; x < r + 1; x++) {
							sub += (x + 1) + " ";
							num++;
						}
						found = true;
						break;
					}
				}
			}
			System.out.println(num);
			if (!sub.equals("")) {
				System.out.println(sub);
			}
		}
		in.close();
	}
}
