package bagicJavaChapter4.Looping;

import java.util.Random;
import java.util.Scanner;

public class TestExam2To7 {
	public static void main(String[] args) {
		System.out.println("문제 2번");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		System.out.println();

		System.out.println("문제 3번");
		Random ran = new Random();

		int result = 0;
		while (true) {
			int num1 = ran.nextInt(6) + 1;
			int num2 = ran.nextInt(6) + 1;
			System.out.println(num1 + "" + num2);
			result = num1 + num2;
			if (result == 5) {
				break;
			}
		}
		System.out.println(result);

		System.out.println();
		System.out.println("문제 4번");
		for (int j = 1; j <= 10; j++) {
			for (int k = 1; k <= 10; k++) {
				if ((4*j)+(5*k) == 60) {
					System.out.println("(" + j + "," + k + ")");
				}
			}
		}

		System.out.println();
		System.out.println("문제 5번");
		for (int n = 0; n < 4; n++) {
			System.out.print("*");
			for (int o = 0; o < n; o++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("문제 6번");
		for (int o = 0; o < 4; o++) {
			for (int p = 3; p > o; p--) {
				System.out.print(" ");
			}
			for (int q = 0; q <= o; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("문제 7번");
		boolean run = true;
		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			int menuKay = scanner.nextInt();;
			switch (menuKay) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;

			}

		}System.out.println("프로그램 종료");
	}
}
