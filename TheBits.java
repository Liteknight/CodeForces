import java.util.Scanner;

public class TheBits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		String a = in.next(), b = in.next();
		
		in.close();
		long z = 0, oz = 0, oo = 0, zz = 0;
		for (i = 0; i < n; i++) {

			if (a.charAt(i) == '0')
				z++;
			if (a.charAt(i) == '1' && b.charAt(i) == '0')
				oz++;
			if (a.charAt(i) == '1' && b.charAt(i) == '1')
				oo++;
			if (a.charAt(i) == '0' && b.charAt(i) == '0')
				zz++;
		}
		System.out.println(oo * zz + oz * z);
	}
}
