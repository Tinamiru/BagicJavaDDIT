package bagicJavaChapter5_2_Array;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static String ran() {
		Random random = new Random();
		int ranNum = random.nextInt(3);
		String rcp = "";
		if (ranNum == 1) {
			rcp = "가위";
		} else if (ranNum == 2) {
			rcp = "바위";
		} else {
			rcp = "보";
		}
		System.out.println(rcp);
		return rcp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("가위 바위 보를 입력하세요: ");
		String user = scanner.nextLine();
		String result = "";

		if (user != "가위" || user != "바위" || user != "보") {
			System.out.println("가위 바위 보만 입력하십시오.");
			return;
		}

		String com = ran();

		if (user.equals(com)) {
			result = "비김";
		} else if (user.equals("바위") && com.equals("가위") || user.equals("가위") && com.equals("보")
				|| user.equals("보") && com.equals("바위")) {
			result = "승리";
		} else {
			result = "패배";
		}

		System.out.println("게이머: " + user);
		System.out.println("인공지능 컴퓨터: " + com);
		System.out.printf("결과: %s!", result);

	}
}
