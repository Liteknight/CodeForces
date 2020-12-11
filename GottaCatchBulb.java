import java.util.Scanner;

public class GottaCatchBulb {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		int a[] = new int[9], i;
		for (i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'B':
				a[0]++;
				break;
			case 'u':
				a[1]++;
				break;
			case 'l':
				a[2]++;
				break;
			case 'b':
				a[3]++;
				break;
			case 'a':
				a[4]++;
				break;
			case 's':
				a[5]++;
				break;
			case 'r':
				a[6]++;
				break;
			}
		}
		System.out.println(Math.min(
				Math.min(Math.min(Math.min(Math.min(Math.min(a[0], a[1] / 2), a[2]), a[3]), a[4] / 2), a[5]), a[6]));
	}
}
