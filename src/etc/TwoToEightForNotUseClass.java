package etc;

import java.util.Scanner;

// 클래스를 활용하여 자바 기본 클래스를 호출하지 않고 2진수를 10진수와 8진수로 변환하여보자.
class calToDecimal {
	int par;
	int toTen;

	public void input(int parameter) { // 인풋.
		this.par = parameter;
	}

	public void ten() {
		String strVer = String.valueOf(par);
		String input = strVer;
		String reverce = "";

		int numLength = input.length();
		int pow = 2;
		int twoNum = 0;
		int tenResult = 0;

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
				tenResult = tenResult + (twoNum * pow);
			}
			if (j != 0) {
				pow = pow * 2;
			}
		}
		System.out.println(tenResult);
		toTen = tenResult;
	}

	public void eight() {
		String bowl = "";
		int tenSRC1 = toTen;
		int tenSRC2 = toTen;

		while (tenSRC2 != 0) {
			bowl += tenSRC1 % 8;
			tenSRC2 = tenSRC2 / 8;
			tenSRC1 = tenSRC2;
		}

		// 숫자뒤집기

		String input = String.valueOf(bowl); // string 변환
		String revInput = input;
		String revResult = "";

		for (int i = revInput.length() - 1; i >= 0; i--) {
			revResult += revInput.charAt(i);
		}
		System.out.println(revResult);
	}
}

public class TwoToEightForNotUseClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		calToDecimal ctd = new calToDecimal();
		
		System.out.print("2진수를 입력하세요:");
		int input = scanner.nextInt();
				
		ctd.input(input);
		System.out.print("10진수 : ");
		ctd.ten();
		System.out.print("8진수 : ");
		ctd.eight();
	}
}