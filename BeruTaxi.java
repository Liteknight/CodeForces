import java.util.Scanner;

public class BeruTaxi {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), n = in.nextInt(), i;
		double o = Double.MAX_VALUE;

		for (i = 0; i < n; i++) {
			int x = in.nextInt(), y = in.nextInt(), v = in.nextInt();
			
			double d = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
			o = Math.min(o, d / v);
		}
		in.close();
		System.out.println(o);
	}
}
