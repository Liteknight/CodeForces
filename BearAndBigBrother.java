import java.util.Scanner;

public class BearAndBigBrother {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int limak = sc.nextInt();
		int bob = sc.nextInt();		
		int year = 0;
		
		while (limak <= bob) {		
			year++;		
			bob *= 2;	
			limak *= 3;
		}		
		System.out.println(year);
		sc.close();
	}
}