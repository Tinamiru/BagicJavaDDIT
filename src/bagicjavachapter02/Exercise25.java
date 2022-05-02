package bagicjavachapter02;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ten, fifty, hund, fiveHund;
		System.out.print("500원짜리 동전의 갯수: ");
		fiveHund = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		hund = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		fifty = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		ten = scanner.nextInt();

		int totalFiveHund = fiveHund * 500;
		int totalHund = hund * 100;
		int totalFifty = fifty * 50;
		int totalTen = ten * 10;
		int total = totalFifty + totalFiveHund + totalHund + totalTen;

		System.out.println("저금통 안의 동전의 총 액수: " + total);
	}

}