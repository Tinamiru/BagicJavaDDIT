package bagicJavaChapter4_2_Looping;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("월을 입력하세요(1~12)");
		int input = scanner.nextInt();
		int switchNum = 0;

		if (input >= 3 && input <= 5) {
			switchNum = 1;
		} else if (input >= 6 && input <= 8) {
			switchNum = 2;
		} else if (input >= 9 && input <= 11) {
			switchNum = 3;
		} else if (input == 12 || input <= 2) {
			switchNum = 4;
		} else {
			System.out.println(input + "은 잘못된 입력입니다.");
		}
		switch (switchNum) {
		case 1:
			System.out.println(input + "월은 봄입니다.");
			break;
		case 2:
			System.out.println(input + "월은 여름입니다.");
			break;
		case 3:
			System.out.println(input + "월은 가을입니다.");
			break;
		case 4:
			System.out.println(input + "월은 겨울입니다.");
			break;
		}
	}
}
