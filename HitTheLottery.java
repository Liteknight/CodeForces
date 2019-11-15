import java.util.Scanner;

public class HitTheLottery {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bills = 0;
		
		while (n != 0) {
			
			if (n % 100 == 0) {
				n -= 100;
				bills++;
				
			} else if (n % 20 == 0) {
				n -= 20;
				bills++;
				
			} else if (n % 10 == 0) {
				n -= 10;
				bills++;
				
			} else if (n % 5 == 0) {
				n -= 5;
				bills++;
				
			} else {
				n--;
				bills++;
			}
		}
		
		System.out.println(bills);
		sc.close();
	}
}