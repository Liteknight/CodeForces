import java.util.Scanner;

public class NextTest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[3002];
		for (i = 0; i < n; i++)
			a[in.nextInt()]++;
		in.close();

		for (i = 1; i < 3002; i++)
			if (a[i] == 0) {
				System.out.println(i);
				break;
			}
	}
}
