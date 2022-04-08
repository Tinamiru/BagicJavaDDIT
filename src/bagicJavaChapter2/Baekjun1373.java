package bagicJavaChapter2;

import java.util.Scanner;

public class Baekjun1373 {
//		2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
//		첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
//		첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
//		입력
//		11001100

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String reverce = "";

		int numLength = input.length();
		int pow = 2; // 2진수
		int twoNum = 0;
		int result = 0;

		for (int i = numLength - 1; i >= 0; i--) {
			reverce += input.charAt(i);
		}

		for (int j = 0; j < numLength; j++) {
			twoNum = reverce.charAt(j);
			if (reverce.charAt(j) != 48) {
				twoNum = 1;
			} else {
				twoNum = 0;
			}

			if (twoNum != 0) {
				result = result + (twoNum * pow);
			}
			if (j != 0) {
				pow = pow * 2;
			}
		}
		result = result - 1;
		System.out.println("10진수 : " + result);

		int division = 0;
		int eightResult = 0;
		division = result % 8;

		System.out.println("8진수 : " + division);
		sc.close();
	}

}