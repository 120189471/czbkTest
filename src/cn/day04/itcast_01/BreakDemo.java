package cn.day04.itcast_01;

public class BreakDemo {
	public static void main(String[] args) {
		/*
		 * for (int x = 0; x < 10; x++) { if (x == 2) { break; }
		 * System.out.println("x:" + x); }
		 */

		wc: for (int i = 0; i < 3; i++) {
			nc: for (int j = 0; j < 4; j++) {
				if (j == 2) {
					//break nc;
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	System.exit(0);
	}
}
