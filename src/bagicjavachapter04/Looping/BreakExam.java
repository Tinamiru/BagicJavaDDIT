package bagicjavachapter04.Looping;

import java.util.Random;

public class BreakExam {
	public static void main(String[] args) {
		Random ran = new Random();
		while (true) {
			int num = ran.nextInt(6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
