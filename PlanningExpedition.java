import java.util.Scanner;

public class PlanningExpedition {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, a[] = new int[101], o = 0;

		for (i = 0; i < m; i++)
			a[in.nextInt()]++;	
		in.close();
		
		for (i = 1; i < 101; i++) {
			int x = 0;
			
			for (int y : a)
				x += y / i;
			if (x >= n)
				o = i;
		}
		System.out.println(o);
	}
}
