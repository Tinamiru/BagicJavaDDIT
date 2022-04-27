package todayLunch;

import java.util.Scanner;

public class FoodController {
	public void mainView() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("-------------------------------------------------------");
		System.out.println("               Today's Choice Program");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.선택\t\t\t2.목록\t\t\t3.종료");
		System.out.println("-------------------------------------------------------");
		System.out.print("입력> ");
		int input = Integer.parseInt(scanner.nextLine());

		switch (input) {
		case 1:
			setChoice();
			break;
		case 2:
			setList();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;

		default:
			System.out.println("허용된 숫자만 입력하세요.");
			mainView();
		}
	}

	public void setChoice() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("-------------------------------------------------------");
		System.out.println("                        선택");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.설정\t\t\t2.출력\t\t\t3.메인 메뉴");
		System.out.println("-------------------------------------------------------");
		System.out.print("입력> ");
		int input = Integer.parseInt(scanner.nextLine());
		FoodList foodList = new FoodList();

		switch (input) {
		case 1:
			System.out.println("특정설정");
			setChoice();
			break;
		case 2:
			foodList.listRandom();
			setChoice();
			break;
		case 3:
			mainView();
		default:
			System.out.println("허용된 숫자만 입력하세요.");
			setChoice();
		}
	}

	public void setList() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("-------------------------------------------------------");
		System.out.println("               선택");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.다시보기 2.메인 메뉴");
		System.out.println("-------------------------------------------------------");
		System.out.print("입력> ");

		int input = Integer.parseInt(scanner.nextLine());
		switch (input) {
		case 1:
			setList();
			break;
		case 2:
			mainView();
		default:
			System.out.println("허용된 숫자만 입력하세요.");
			setList();
		}

	}
}
