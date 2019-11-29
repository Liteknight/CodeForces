import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), steps=0, pos=0;
		
		while (pos < x) {
			
			if (x - 5 >= 0) {
				pos += 5;
				steps++;
				
			} else if (x - 4 >= 0) {
				pos += 4;
				steps++;
				
			} else if (x - 3 >= 0) {
				pos += 3;
				steps++;
				
			} else if (x - 2 >= 0) {
				pos += 2;
				steps++;
				
			} else if (x - 1 >= 0) {
				pos++;
				steps++;
			}
		}		
		System.out.println(steps);
		sc.close();
	}
}