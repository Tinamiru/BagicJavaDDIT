package baekjoon;

import java.util.Scanner;

public class BaekJoon1373 {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String reverse = "";
		// 뒤집기
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		// 빈 0자리 채우기
		while (true) {
			if (reverse.length() % 3 != 0) {
				reverse = "0" + reverse;
			} else {
				break;
			}
		}
		System.out.println(reverse);
		// 3자리씩 배열에 담기
		int three = reverse.length() / 3;
		String[] array = new String[three];
		int j = 0;
		int k = 0;
		String num3 = "";
		for (int i = 0; i < three; i++) {
			while (k != 3) {
				num3 += reverse.charAt(j);
				j++;
				k++;
			}
			array[i] = num3;
			num3 = "";
			k = 0;
		}
		String[] result = new String[three];
		int eightNum = 0;
		for (int i = 0; i < three; i++) {
			for (int l = 0; l < 3; l++) {
				if (array[i].charAt(2) == '1') {
					eightNum += 5;
				} else if (array[i].charAt(1) == '1') {
					eightNum += 3;
				} else if (array[i].charAt(0) == '1') {
					eightNum += 1;
				} else {
					break;
				}
			}
			result[i] = Integer.toString(eightNum);
			eightNum = 0;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}
}
