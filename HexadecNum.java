import java.util.Scanner;

public class HexadecNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, o = 0;		
		in.close();
		
		for (i = 1; new Integer(Integer.toBinaryString(i)) <= n; i++)
			o++;
		System.out.println(o);
	}
}
