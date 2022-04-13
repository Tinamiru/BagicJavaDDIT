package bagicJavaChapter3;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년인지 확인할 년도를 입력하세요:");
		int input = scanner.nextInt();
		int caltulate = (((input % 4 == 0 && input % 100 != 0)|| input % 400 == 0)) ? 1 : 0;
		String result = (caltulate == 1)?input+"년은 윤년입니다.":input+"년은 윤년이 아닙니다.";
		System.out.println(result);
	}

}