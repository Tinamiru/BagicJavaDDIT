package bagicJavaChapter4_2_Looping;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위, 바위, 보 게임을 시작합니다.");

		System.out.print("철수: ");
		String boyChoice = scanner.nextLine();
		System.out.print("영희: ");
		String girlChoice = scanner.nextLine();
		String result;


		if (boyChoice.equals("가위")) {
			if (girlChoice.equals("가위")) {
				result = "비겼습니다.";
			} else if (girlChoice.equals("바위")) {
				result = "영희 승리!";
			} else {
				result = "철수 승리!";
			}
		} else if (boyChoice.equals("바위")) {
			if (girlChoice.equals("바위")) {
				result = "비겼습니다.";
			} else if (girlChoice.equals("보")) {
				result = "영희 승리!";
			} else {
				result = "철수 승리!";
			}
		} else if (boyChoice.equals("보")) {
			if (girlChoice.equals("보")) {
				result = "비겼습니다.";
			} else if (girlChoice.equals("가위")) {
				result = "영희 승리!";
			} else {
				result = "철수 승리!";
			}
		} else {
			result = "가위, 바위 보만 내십시오.";
		}
		System.out.println(result);
	}
}