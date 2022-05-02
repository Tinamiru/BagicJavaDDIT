package bagicjavachapter05.Array;

import java.util.Scanner;

public class Exercise5_7 {
	public static void main(String[] args) {
//		if (args.length != 1) { // 입력
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//		}
		Scanner scanner = new Scanner(System.in);
		int money = Integer.parseInt(scanner.nextLine());

		System.out.println("money= " + money);
		int[] coinUnit = { 500, 100, 50, 10 };
		int[] coin = { 5, 5, 5, 5 };
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;

			int result[] = new int[coinUnit.length];
			result[i] = money / coinUnit[i];
			int deduction=0;

			if (money <= 0) {
				break;
			}
			if (result[i] >= 5) {
				coinNum += 5;
				coin[i] -= 5;
				deduction = coinUnit[i] * 5;
			} else {
				coinNum += result[i];
				coin[i] -= result[i];
				deduction = coinUnit[i] * result[i];
			}

			money -= deduction;


			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		System.out.println("=남은 동전의 개수=");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + coin[i]);

		}
	}
}
