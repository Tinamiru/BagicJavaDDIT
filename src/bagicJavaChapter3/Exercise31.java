package bagicJavaChapter3;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int fristNum = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int secondNum = scanner.nextInt();
		int absoluteValue = Math.abs(fristNum - secondNum);

		int bigNum = ((fristNum + secondNum) + absoluteValue) / 2;
		int smallNum = ((fristNum + secondNum) - absoluteValue) / 2;

		int else1 = bigNum % smallNum;

		System.out.println("큰 수를 작은 수로 나눈 몫은 " + (bigNum / smallNum) + "이고, 나머지는 " + else1 + "이다.");
	}

}