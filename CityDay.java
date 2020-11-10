import java.util.Scanner;

public class CityDay {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), x = in.nextInt(), y = in.nextInt(), i, a[] = new int[n];
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		
		in.close();
		for (i = 0; i < n; i++) {
			int b = 1, c = 1, z = 0;
			
			while (i - b >= 0 && b <= x) {
				if (a[i - b] <= a[i])
					z = 1;
				b++;
			}
			while (c < n - i && c <= y) {
				if (a[i + c] <= a[i])
					z = 1;
				c++;
			}
			if (z == 0) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
