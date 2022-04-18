package bagicJavaChapter4_2_Looping;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int num1 = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int num2 = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int num3 = scanner.nextInt();

		int bic, small;

		bic = Math.max((Math.max(num1, num2)), num3);

		if (num1 < num2 && num1 < num3) {
			small = num1;
		} else if (num2 < num3 && num2 < num1) {
			small = num2;
		} else {
			small = num3;
		}

		if (small >= bic) {
			System.out.println("삼각형을 만들 수 있습니다.");
		} else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
	}
}
