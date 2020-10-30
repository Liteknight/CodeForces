import java.util.Scanner;

public class MUHSticks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a[] = new int[10], i;
		String o = "Alien";

		for (i = 0; i < 6; i++)
			a[in.nextInt()]++;
		in.close();

		for (i = 0; i < 10; i++)
			if (a[i] >= 4) {
				a[i] -= 4;
				o = "Bear";
			}
		for (i = 0; i < 10; i++)
			if (a[i] > 1 && o == "Bear")
				o = "Elephant";
		System.out.println(o);
	}
}
