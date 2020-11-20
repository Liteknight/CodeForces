import java.util.Scanner;

public class LuxuriousHouses {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], b[] = new int[n], i, m = 0;
		
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();
		
		for (i = n - 1; i >= 0; i--) {
			if (a[i] > m) {
				b[i] = 0;
				m = a[i];
			} else {
				b[i] = m - a[i] + 1;
			}
		}
		for (int j : b) {
			System.out.print(j + " ");
		}
	}
}
