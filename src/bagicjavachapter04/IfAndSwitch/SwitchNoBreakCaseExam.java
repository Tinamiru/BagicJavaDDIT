package bagicjavachapter04.IfAndSwitch;

import java.util.Random;

public class SwitchNoBreakCaseExam {
	public static void main(String[] args) {
		Random random = new Random();

		int ran = random.nextInt(4);
		int time = ran + 8;
		System.out.println("[현재시각: " + time + "시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");

		}
	}

}
