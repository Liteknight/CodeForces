import java.util.Scanner;

public class ABChess {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i, j, ww = 0, bw = 0;

		for (i = 0; i < 8; i++) {
			String s = in.next();
			
			for (j = 0; j < 8; j++) {
				char c = s.charAt(j);

				if (c == 'Q')
					ww += 9;
				if (c == 'R')
					ww += 5;
				if (c == 'B' || c == 'N')
					ww += 3;
				if (c == 'P')
					ww++;

				if (c == 'q')
					bw += 9;
				if (c == 'r')
					bw += 5;
				if (c == 'b' || c == 'n')
					bw += 3;
				if (c == 'p')
					bw++;
			}
		}
		in.close();
		System.out.println(ww >= bw ? (ww == bw ? "Draw" : "White") : "Black");
	}
}
