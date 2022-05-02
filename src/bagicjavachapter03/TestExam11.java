package bagicjavachapter03;

import java.util.Scanner;

public class TestExam11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("11번문제");
		System.out.print("아이디: ");
		String id = scanner.nextLine();

		System.out.print("패스워드: ");
		String pass = scanner.nextLine();
		int password = Integer.parseInt(pass);

		if (id.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}

	}
}
