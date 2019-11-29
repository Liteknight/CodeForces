import java.util.Scanner;

public class VasyaTheHipster {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), diff=0, same=0;
		
		while (a != 0 && b != 0) {
			a--;
			b--;
			diff++;
		}
		while (a > 1) {
			a -= 2;
			same++;
		}
		while (b > 1) {
			b -= 2;
			same++;
		}
		System.out.println(diff + " " + same);
		sc.close();
	}
}