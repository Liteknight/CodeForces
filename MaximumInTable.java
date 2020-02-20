import java.util.Arrays;
import java.util.Scanner;

public class MaximumInTable {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), row, column;
		int[][] array = new int[n][n];
		Arrays.fill(array[0], 1);
		
		for (row=1; row<n; row++) {			
			for (column=0; column<n; column++) {
				
				// [row][column-1] references integer to left, [row-1][column] references integer above.
				// Math.max is used to prevent negative indices.
				
				array[row][column] = array[row][Math.max(0, column-1)] + array[Math.max(0, row-1)][column];
			}
		}
		System.out.println(array[n-1][n-1]);
		sc.close();
	}
}